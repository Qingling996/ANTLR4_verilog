////////////////////////////////////////////////////////////////////
//COPYRIGHT  <QAG>, <2025>
//The copyright to the document herein is the property of 2025 <QAG>.
//All rights reserved.
////////////////////////////////////////////////////////////////////
//Project: HWF27550101
//Module: Manchester_encode
//Upper Level Module: man_encode_fifo 
//Detail information: <A brief summary of the code's intention>
////////////////////////////////////////////////////////////////////
//Revision: <1.1>
//Revision Date : <2025/04/02>
//Author: <LiangJin> <liangj089@avic.com>
//Revision detail information: 
//<1.1>: < A brief summary of the code's revsion>
//<1.2>: < A brief summary of the code's revsion>
////////////////////////////////////////////////////////////////////

module Manchester_encode (
    /* --------------------- Input Signals --------------------- */
    input                                         I_sys_clk                     ,//system clock 30MHz
    input                                         I_rst_n                       ,//I_rst_n, low valid
    input                                         I_en_code                     ,//����ʹ��
    input                [15:00]                  I_data                        ,//�������������
    /* --------------------- Output Signals -------------------- */
    output reg                                    O_encode                      ,//�����������
    output reg                                    O_en_done                     //
);

/* ================================================================================================  */
/*                                        Parameter                                                  */
/* ================================================================================================  */

    localparam           C_MAX_5M_CNT             = 10'd6                       ;//30M 6��Ƶ
    localparam           C_MAX_SEQ_CNT            = 6'd40                       ;//(3 + 16 + 1) * 2
    
/* ================================================================================================  */
/*                                        Signals                                                    */
/* ================================================================================================  */

    reg                                           S_en_code_d1                  ;//
    reg                  [15:00]                  S_data_d1                     ;//
    wire                                          S_odd_bit                     ;//��У��
    integer                                       S_cnt_loop                    ;//
    wire                 [16:00]                  S_data_tmp                    ;//
    reg                  [33:00]                  S_Man_data                    ;//16bit data + 1bit odd
    reg                  [03:00]                  S_cnt_5m                      ;//Counter
    reg                                           S_add_cnt_5m                  ;//Counter Enable
    wire                                          S_end_cnt_5m                  ;//Counter reset
    reg                  [05:00]                  S_cnt_seq                     ;//Counter
    wire                                          S_add_cnt_seq                 ;//Counter Enable
    wire                                          S_end_cnt_seq                 ;//Counter reset
    
/* ================================================================================================  */
/*                                        Main Code                                                  */
/* ================================================================================================  */

/* ================================================================================================  */
/*                                  1. Input data storage                                            */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_en_code_d1 <= 1'b0;
        end
        else begin
            S_en_code_d1 <= I_en_code;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_data_d1 <= 16'd0;
        end
        else if(I_en_code == 1'b1)begin
            S_data_d1 <= I_data;
        end
    end
    
/* ================================================================================================  */
/*                             2. Input data odd verification                                        */
/* ================================================================================================  */

    assign          S_odd_bit                     = ~(^S_data_d1);

/* ================================================================================================  */
/*                         3. [Data+Verification] Manchester Code                                    */
/* ================================================================================================  */

    assign          S_data_tmp                    = {S_odd_bit,S_data_d1};
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_loop = 5'd0;
            S_Man_data = 34'd0;
        end
        else if(I_en_code == 1'b1)begin
            S_cnt_loop = 5'd0;
        end
        else if(S_en_code_d1 == 1'b1)begin
            for (S_cnt_loop = 0; S_cnt_loop < 5'd17; S_cnt_loop = S_cnt_loop + 5'd1) begin//data msb + check bit
                if(S_cnt_loop == 16)begin                           //check bit
                    if(S_data_tmp[S_cnt_loop] == 1'b1)begin
                        S_Man_data[(S_cnt_loop << 1)]      = 1'b1;
                        S_Man_data[(S_cnt_loop << 1) + 1]  = 1'b0;
                    end
                    else begin
                        S_Man_data[(S_cnt_loop << 1)]      = 1'b0;
                        S_Man_data[(S_cnt_loop << 1) + 1]  = 1'b1;
                    end
                end
                else begin                                          //data MSB
                    if(S_data_tmp[S_cnt_loop] == 1'b1)begin
                        S_Man_data[31-(S_cnt_loop << 1) - 1] = 1'b1;
                        S_Man_data[31-(S_cnt_loop << 1)]     = 1'b0;
                    end
                    else begin
                        S_Man_data[31-(S_cnt_loop << 1) - 1] = 1'b0;
                        S_Man_data[31-(S_cnt_loop << 1)]     = 1'b1;
                    end
                end
            end
        end
    end
    
/* ================================================================================================  */
/*                               4. Manchester Coded Output                                          */
/* ================================================================================================  */

    //1. 16 frequency division, data transmission rate of 5Mbps
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_add_cnt_5m <= 1'b0;
        end
        else if(I_en_code == 1'b1)begin
            S_add_cnt_5m <= 1'b1;
        end
        else if(O_en_done == 1'b1)begin
            S_add_cnt_5m <= 1'b0;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_5m <= 'd0;
        end
        else if(S_add_cnt_5m)begin
            if(S_end_cnt_5m)begin
                S_cnt_5m <= 'd0;
            end
            else begin
                S_cnt_5m <= S_cnt_5m + 1'b1;
            end
        end
        else begin
            S_cnt_5m <= 'd0;
        end
    end
    assign          S_end_cnt_5m                  = S_add_cnt_5m && (S_cnt_5m == ((C_MAX_5M_CNT>>1)-1));//1��5M�����ڰ�����0-1 / 1-0��

    // 2. Send sequence counter
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_seq <= 'd0;
        end
        else if(O_en_done)begin
            S_cnt_seq <= 'd0;
        end
        else if(S_add_cnt_seq)begin
            if(S_end_cnt_seq)begin
                S_cnt_seq <= 'd0;
            end
            else begin
                S_cnt_seq <= S_cnt_seq + 1'b1;
            end
        end
        else begin
            S_cnt_seq <= S_cnt_seq;
        end
    end
    assign          S_add_cnt_seq                 = S_end_cnt_5m;
    assign          S_end_cnt_seq                 = S_add_cnt_seq && S_cnt_seq == C_MAX_SEQ_CNT - 1;
    // 3. Data output
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            O_encode <= 1'b0;                                       //����Ϊ��
        end
        else if(S_cnt_seq < 6'd3)begin                              //֡ͷ�͵�ƽ
            O_encode <= 1'b0;
        end
        else if(S_cnt_seq >= 3 && S_cnt_seq < 6'd6)begin            //֡ͷ�ߵ�ƽ
            O_encode <= 1'b1;
        end
        else begin                                                  //data MSB + check
            O_encode <= S_Man_data[S_cnt_seq-6];
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            O_en_done <= 1'b0;
        end
        else begin
            O_en_done <= S_end_cnt_seq;
        end
    end

endmodule                                                           //Manchester_encode END