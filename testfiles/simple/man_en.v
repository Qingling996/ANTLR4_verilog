////////////////////////////////////////////////////////////////////
//COPYRIGHT  <QAG>, <2025>
//The copyright to the document herein is the property of 2025 <QAG>.
//All rights reserved.
////////////////////////////////////////////////////////////////////
//Project: HWF27550101A
//Module: test_always
//Upper Level Module: / 
//Detail information: <A brief summary of the code's intention>
////////////////////////////////////////////////////////////////////
//Revision: <1.1>
//Revision Date : 2025-05-29
//Author: <LiangJin> <liangj089@avic.com>
//Revision detail information: 
//<1.1>: < A brief summary of the code's revsion>
//<1.2>: < A brief summary of the code's revsion>
////////////////////////////////////////////////////////////////////

module test_always(
    /* --------------------- Input Signals --------------------- */
    input                                         I_sys_clk                     ,//System Clock xx MHz
    input                                         I_rst_n                       ,//Reset Signal, Low Valid
    input                                         I_a                           ,//
    /* --------------------- Output Signals -------------------- */
    output reg                                    O_cc                          //
    
);

/* ================================================================================================  */
/*                                             Main Code                                             */
/* ================================================================================================  */
 always @(posedge I_sys_clk or negedge I_rst_n) begin
 if(I_rst_n == 1'b0) begin
 O_cc <= 1'b0;
 end
 else begin
 O_cc <= I_a; // O_cc will follow the value of I_a
 end
 end
endmodule //test_always END