////////////////////////////////////////////////////////////////////
//COPYRIGHT  <QAG>, <2025>
//The copyright to the document herein is the property of 2025 <QAG>.
//All rights reserved.
////////////////////////////////////////////////////////////////////
//Project: HWF27550101A
//Module: CCDL
//Upper Level Module: / 
//Detail information: <A brief summary of the code's intention>
////////////////////////////////////////////////////////////////////
//Revision: <1.1>
//Revision Date : <2025/04/02>
//Author: <LiangJin> <liangj089@avic.com>
//Revision detail information: 
//<1.1>: CCDL is a FPGA top-level design based on CCDL (communication channel data link) protocol, which realizes data interface control, data link conversion, CCDL codec, data asynchronous sending and receiving
////////////////////////////////////////////////////////////////////

module CCDL #(
    parameter            C_WR_ADDR                = 24'h0001E0                  ,
    parameter            C_RD_ADDR                = 24'h001110                  ,
    parameter            C_RD_ADDR_self           = 24'h001112                  
    )(
    /* --------------------- Input Signals --------------------- */

    input                                         I_sys_clk                     ,// 系统时钟
    input                                         I_80M_clk                     ,// 80MHz 时钟
    input                                         I_rst_n                       ,// 复位信号，低电平有效

    input                                         I_EBI_CS_n                    ,// EBI 片选1，低电平有效
    input                                         [23:00]                       I_EBI_Addr                    ,// EBI 地址总线
    input                                         I_EBI_WE_n                    ,// EBI 读写控制

    input                                         [15:00]                       I_CCDL_TX_data                ,//
    input                                         [15:00]                       I_CCDL_TX_RAM_clear           ,//
    input                                         [15:00]                       I_CCDL_RX_RAM1_clear          ,//
    input                                         [15:00]                       I_CCDL_RX_RAM3_clear_self     ,//
    input                                         [15:00]                       I_CCDL_encode_en              ,//
    input                                         [15:00]                       I_CCDL_decode_en              ,//
    input                                         [15:00]                       I_CCDL_self_test_en           ,//

    input                                         I_COM_CCDL_IN                 ,// 解码输入
    input                                         I_COM_CCDL_OUT_WRAP           ,// 解码输入回环
    /* --------------------- Output Signals -------------------- */
    output                                        [15:0                         ]                  O_CCDL_RX_DATA                ,// 16位读数据总线
    output                                        [15:0                         ]                  O_CCDL_RX_DATA_self           ,
    output                                        [15:0                         ]                  O_CCDL_RAM_status             ,
    output                                        [15:0                         ]                  O_CCDL_config_status          ,
    output                                        O_COM_CCDL_OUT                // CCDL 输出
);

/* ================================================================================================  */
/*                                        Signals                                                    */
/* ================================================================================================  */
    wire                                          S_CCDL_TX_RAM_clear           ;
    wire                                          S_CCDL_RX_RAM1_clear          ;
    wire                                          S_CCDL_RX_RAM3_clear_self     ;
    wire                                          S_decode_en                   ;
    wire                                          S_encode_en                   ;
    wire                                          S_CCDL_self_test_en           ;
    wire                                          S_CCDL_TXFIFO_en_ccdl         ;// CCDL 发送 FIFO 使能

    wire                                          S_txfifo_full                 ;// 发送 FIFO 满信号
    wire                                          S_txfifo_empty                ;// 发送 FIFO 空信号
    wire                                          S_rxfifo_full                 ;// 接收 FIFO 满信号
    wire                                          S_rxfifo_empty                ;// 接收 FIFO 空信号
    wire                                          S_rxfifo_Self_Test_full       ;// 回绕接收 FIFO 满信号
    wire                                          S_rxfifo_Self_Test_empty      ;// 回绕接收 FIFO 空信号

    wire                                          S_rev1_fifo_rd_ccdl           ;// FIFO 读信号
    wire                                          S_rev2_fifo_rd_ccdl           ;// 回绕FIFO 读信号

/* ================================================================================================  */
/*                                        Main Code                                                  */
/* ================================================================================================  */

    switch_CCDL #(
        .C_WR_ADDR                      (C_WR_ADDR                              ),
        .C_RD_ADDR                      (C_RD_ADDR                              ),
        .C_RD_ADDR_self                 (C_RD_ADDR_self                         )
    )UUT0_switch_CCDL(
    /* --------------------- Input Signals --------------------- */
        .I_sys_clk                      (I_sys_clk                              ),
        .I_rst_n                        (I_rst_n                                ),
        .I_EBI_CS_n                     (I_EBI_CS_n                             ),
        .I_EBI_WE_n                     (I_EBI_WE_n                             ),
        .I_EBI_Addr                     (I_EBI_Addr                             ),

        .I_CCDL_TX_RAM_clear            (I_CCDL_TX_RAM_clear                    ),
        .I_CCDL_RX_RAM1_clear           (I_CCDL_RX_RAM1_clear                   ),
        .I_CCDL_RX_RAM3_clear_self      (I_CCDL_RX_RAM3_clear_self              ),
        .I_CCDL_encode_en               (I_CCDL_encode_en                       ),
        .I_CCDL_decode_en               (I_CCDL_decode_en                       ),
        .I_CCDL_self_test_en            (I_CCDL_self_test_en                    ),

        .I_TXFIFO_FULL_ccdl             (S_txfifo_full                          ),
        .I_TXFIFO_EMPTY_ccdl            (S_txfifo_empty                         ),
        .I_RXFIFO_FULL_ccdl             (S_rxfifo_full                          ),
        .I_RXFIFO_EMPTY_ccdl            (S_rxfifo_empty                         ),
        .I_RXFIFO_FULL_Self_Test_ccdl   (S_rxfifo_Self_Test_full                ),
        .I_RXFIFO_EMPTY_Self_Test_ccdl  (S_rxfifo_Self_Test_empty               ),
    /* --------------------- Output Signals -------------------- */
        .O_CCDL_TX_RAM_clear            (S_CCDL_TX_RAM_clear                    ),
        .O_CCDL_RX_RAM1_clear           (S_CCDL_RX_RAM1_clear                   ),
        .O_CCDL_RX_RAM3_clear_self      (S_CCDL_RX_RAM3_clear_self              ),
        .O_CCDL_encode_en               (S_encode_en                            ),
        .O_CCDL_decode_en               (S_decode_en                            ),
        .O_CCDL_self_test_en            (S_CCDL_self_test_en                    ),
        .O_CCDL_TXFIFO_en_ccdl          (S_CCDL_TXFIFO_en_ccdl                  ),
        .O_rev1_fifo_rd_ccdl            (S_rev1_fifo_rd_ccdl                    ),
        .O_rev2_fifo_rd_ccdl            (S_rev2_fifo_rd_ccdl                    ),
        .O_CCDL_RAM_status              (O_CCDL_RAM_status                      ),
        .O_CCDL_config_status           (O_CCDL_config_status                   )
    );

    CCDL_top UUT1_CCDL_top (
        /* --------------------- Input Signals --------------------- */
        .I_sys_clk                      (I_sys_clk                              ),
        .I_clk_80M                      (I_80M_clk                              ),
        .I_rst_n                        (I_rst_n                                ),
        .I_CCDL_TX_data                 (I_CCDL_TX_data                         ),
        .I_CCDL_TX_RAM_clear            (S_CCDL_TX_RAM_clear                    ),
        .I_CCDL_RX_RAM1_clear           (S_CCDL_RX_RAM1_clear                   ),
        .I_CCDL_RX_RAM3_clear_self      (S_CCDL_RX_RAM3_clear_self              ),
        .I_decode_en                    (S_decode_en                            ),
        .I_encode_en                    (S_encode_en                            ),
        .I_CCDL_self_test_en            (S_CCDL_self_test_en                    ),
        .I_CCDL_WR_flag                 (S_CCDL_TXFIFO_en_ccdl                  ),
        .I_CCDL_RD_flag                 (S_rev1_fifo_rd_ccdl                    ),
        .I_CCDL_RD_flag_Self_Test       (S_rev2_fifo_rd_ccdl                    ),
        .I_COM_CCDL_IN                  (I_COM_CCDL_IN                          ),
        .I_COM_CCDL_OUT_WRAP            (I_COM_CCDL_OUT_WRAP                    ),
        /* --------------------- Output Signals -------------------- */
        .O_CCDL_OUT                     (O_COM_CCDL_OUT                         ),
        .O_CCDL_RX_DATA                 (O_CCDL_RX_DATA                         ),
        .O_full_tx                      (S_txfifo_full                          ),
        .O_empty_tx                     (S_txfifo_empty                         ),
        .O_full_rx                      (S_rxfifo_full                          ),
        .O_empty_rx                     (S_rxfifo_empty                         ),
        .O_CCDL_RX_DATA_Self_Test       (O_CCDL_RX_DATA_self                    ),
        .O_full_rx_Self_Test            (S_rxfifo_Self_Test_full                ),
        .O_empty_rx_Self_Test           (S_rxfifo_Self_Test_empty               )
    );

endmodule
