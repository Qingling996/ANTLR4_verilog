///////////////////////////////////////////////////////////////////////////
/// Project Name         :    
/// Software             : VS Code / Vivado 2018.3 / Modelsim SE 10.6e
/// Target Device        : 
/// Module Name          : adder
/// Upper Level Module   : / 
/// Detail Info          : <A brief summary of the code's intention>
///////////////////////////////////////////////////////////////////////////
/// Revision             : <1.0>
/// Revision Date        : <2025-05-28 10:37:03>
/// Author               : Adolph adolph1354238998@gmail.com
/// Revision Detail Info : 
/// <1.0> <2025-05-28>   : < A brief summary of the code's revsion>
/// <1.1> <2025-xx-xx>   : < A brief summary of the code's revsion>
///////////////////////////////////////////////////////////////////////////

module adder #(
    parameter            C_DATA_WIDTH             = 4                           
    )(
    /* --------------------- Input Signals --------------------- */
    input                                         I_sys_clk                     ,//System Clock xx MHz
    input                                         I_rst_n                       ,//Reset Signal, Low Valid
    input                [C_DATA_WIDTH-1:0 ]      I_a                           ,//
    input                [C_DATA_WIDTH-1:0 ]      I_b                           ,//
    /* --------------------- Output Signals -------------------- */
    input                [C_DATA_WIDTH:0 ]        O_sum                         //
);

/* ================================================================================================  */
/*                                             Main Code                                             */
/* ================================================================================================  */
    assign          O_sum                         = I_a + I_b;

endmodule //adder END