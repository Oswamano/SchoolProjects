// Matthew O'Connor
// Homework 8 .v file Student Number 50000250
module Problem_5_36 (output A, B, input Clock, reset_b);
or (T_A, A, B);
or (T_B, A_b, B);
T_flop M0 (A, A_b, T_A, Clock, reset_b);
T_flop M1 (B, B_b, T_B, Clock, reset_b);
endmodule
module T_flop (output reg Q, output QB, input T, Clock, reset_b);
assign QB = ~ Q;
always @ (posedge Clock, negedge reset_b)
if (reset_b == 0) Q <= 0;
else if (T) Q <= ~Q;
endmodule
module t_Problem_5_36 ();
wire A, B;
reg Clock, reset_b;
Problem_5_36 M0 (A, B, Clock, reset_b);
initial #350$finish;
initial begin Clock = 0; forever #5 Clock = ~Clock; end
initial fork
$dumpfile("hw8_wv.vcd");
#2 reset_b = 1;
#3 reset_b = 0;
#4 reset_b = 1;
join
endmodule


