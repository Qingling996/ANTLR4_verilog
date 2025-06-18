////////////////////////////////////////////////////////////////////
//COPYRIGHT  <QAG>, <2025>
//The copyright to the document herein is the property of 2025 <QAG>.
//All rights reserved.
////////////////////////////////////////////////////////////////////
//Project: HWF27550101
//Module: sample
//Upper Level Module: man_sample_dec_fifo 
//Detail information: <A brief summary of the code's intention>
////////////////////////////////////////////////////////////////////
//Revision: <1.1>
//Revision Date : <2025/04/02>
//Author: <LiangJin> <liangj089@avic.com>
//Revision detail information: 
//<1.1>: < A brief summary of the code's revsion>
//<1.2>: < A brief summary of the code's revsion>
////////////////////////////////////////////////////////////////////

/// Main Function:(Describing main function of the module)
/// 6分频，计数器计0-5
// 在 cnt == 4 ，的时候，统计前三个周期的计数值， 0、1->0  2、3->1
// 进而决定整个周期的数据为 {x,~x}
///*********************************************************************///
`define aa123 (123 + TIMES)
`ifdef macro
`elsif ma1
`endif
`timescale 1ns/1ps
// `include "test.txt"

module sample(
    /* --------------------- Input Signals --------------------- */
    input                                         I_sys_clk                     ,//system clock 30 MHz
    input                                         I_rst_n                       ,//I_rst_n, low valid
    input                                         I_CCDL_IN                     ,//曼彻斯特编码数据帧
    /* --------------------- Output Signals -------------------- */
    output reg           [31:00]                  O_sample_data                 ,//采样后的曼彻斯特编码
    output reg                                    O_sample_valid                //输出有效
);

/* ================================================================================================  */
/*                                        Parameter                                                  */
/* ================================================================================================  */

    localparam           C_MAX_5M_CNT             = 6'd6                        ;//30MHz 6分频
    localparam           C_JUDGE_ONE              = 4'd2                        ;
    localparam           C_JUDGE_ZERO             = 4'd1                        ;

/* ================================================================================================  */
/*                                        Signals                                                    */
/* ================================================================================================  */

    reg                  [01:00]                  S_data_d                      ;//
    wire                                          S_pos_data                    ;//
    wire                                          S_neg_data                    ;//
    reg                                           S_frame_front_high            ;//
    reg                                           S_work_enable                 ;//
    reg                  [05:00]                  S_cnt_frame                   ;//
    reg                  [03:00]                  S_cnt_5m                      ;//
    reg                  [03:00]                  S_data_sum                    ;//
    reg                  [01:00]                  S_data_sample                 ;//
    reg                  [05:00]                  S_cnt_bit                     ;//16bit-data + 1bit odd
    reg                  [33:00]                  S_reg_dout                    ;//
    reg                                           S_end_dly                     ;//

/* ================================================================================================  */
/*                                        Main Code                                                  */
/* ================================================================================================  */

/* ================================================================================================  */
/*                              1. Input data edge detection                                         */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_data_d <= 2'b00;
        end
    else begin
            S_data_d <= {S_data_d[0],I_CCDL_IN};
        end
    end
    assign          S_pos_data                    = S_data_d == 2'b01;
    assign          S_neg_data                    = S_data_d == 2'b10;

/* ================================================================================================  */
/*                   2. Frame header judgment and sampling enable signal                             */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_work_enable <= 1'b0;
        end
        else if(S_cnt_bit == 6'd16 && (S_cnt_5m == (C_MAX_5M_CNT  - 1)))begin
            S_work_enable <= 1'b0;
        end
          else if(S_frame_front_high == 1'b1 && (S_cnt_frame == 6'd7))begin// (30 / 5) * 1.5 - 2
            S_work_enable <= 1'b1;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_frame_front_high <= 1'b0;
        end
        else if(S_work_enable == 1'b0 && S_pos_data == 1'b1)begin   //帧头高电平使能
            S_frame_front_high <= 1'b1;
        end
        else if(S_frame_front_high == 1'b1 && (S_cnt_frame == 6'd7))begin
            S_frame_front_high <= 1'b0;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_frame <= 6'd0;
        end
        else if(S_frame_front_high == 1'b1)begin
            S_cnt_frame <= S_cnt_frame + 6'd1;
        end
        else begin
            S_cnt_frame <= 6'd0;
        end
    end

/* ================================================================================================  */
/*                                 3. N-fold sampling data                                           */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_5m <= 4'd0;
        end
        else if(S_work_enable == 1'b1)begin
            if(S_cnt_5m == ((C_MAX_5M_CNT - 1)))begin
                S_cnt_5m <= 4'd0;
            end
            else begin
                S_cnt_5m <= S_cnt_5m + 4'd1;
            end
        end
        else begin
            S_cnt_5m <= 4'd0;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_data_sum <= 4'd0;
        end
        else if(S_work_enable == 1'b1)begin                         //采集数据期间
            if(S_cnt_5m == ((C_MAX_5M_CNT - 2)))begin               //每16bit 采集结束
                S_data_sum <= 4'd0;
            end
            else if((S_data_d[0] == 1'b1) && (S_cnt_5m < 3))begin
                S_data_sum <= S_data_sum + 4'd1;
            end
        end
        else begin
            S_data_sum <= 4'd0;
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_data_sample <= 2'b0;
        end
        else if(S_work_enable == 1'b0 && S_pos_data == 1'b1)begin   //每帧开始，清零
            S_data_sample <= 2'b0;
        end
        else if(S_work_enable == 1'b1 && (S_cnt_5m == ((C_MAX_5M_CNT - 2))))begin
            if(S_data_sum >= C_JUDGE_ONE)begin                      //2025-03-03 22:50:26  阈值
                S_data_sample <= 2'b10;
            end
            else if(S_data_sum <= C_JUDGE_ZERO)begin
                S_data_sample <= 2'b01;
            end
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_cnt_bit <= 6'd0;
        end
        else if(S_work_enable == 1'b0)begin
            S_cnt_bit <= 6'd0;
        end
        else if(S_work_enable == 1'b1 && (S_cnt_5m == ((C_MAX_5M_CNT - 1))))begin
            if(S_cnt_bit == 6'd16)begin
                S_cnt_bit <= 6'd0;
            end
            else begin
                S_cnt_bit <= S_cnt_bit + 6'd1;
            end
        end
    end

/* ================================================================================================  */
/*                               4. Update data to register                                          */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_reg_dout <= 32'd0;
        end
        else if(S_cnt_5m == C_MAX_5M_CNT - 1)begin
            // S_reg_dout <= {S_data_sample,S_reg_dout[33:02]};
            S_reg_dout[(S_cnt_bit << 1)+1-:2] <= {S_data_sample[0],S_data_sample[1]};
        end
    end

/* ================================================================================================  */
/*                                     5. Data output                                                */
/* ================================================================================================  */

    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            S_end_dly <= 1'b0;
        end
        else begin
            S_end_dly <= ((S_cnt_bit == 6'd16) && (S_cnt_5m == C_MAX_5M_CNT-1));
        end
    end
        
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            O_sample_data <= 32'd0;
        end
        else if(S_end_dly)begin
            O_sample_data <= S_reg_dout[31:00];
        end
    end
    always @(posedge I_sys_clk or negedge I_rst_n)begin
        if(!I_rst_n)begin
            O_sample_valid <= 1'b0;
            end
        else if(S_end_dly)begin
            O_sample_valid <= 1'b1;
        end
        else begin
            O_sample_valid <= 1'b0;
        end
    end

endmodule                                                           //sample END