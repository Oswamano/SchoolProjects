//Matthew O'Connor
//Homework #7 problem 4.42









// Part a answer


module 4_42_A(input A, B, C, D, output w, x, y, z);
wire B_not, C_or_D_not;
wire CD, C_or_D;
or (C_or_D, C, D);
not (C_or_D_bar, C_or_D);
not (B_bar, B);
and
(CD, C, D);
not (z, D);
or (y, CD, C_or_D_bar);
and
(w1, C_or_D_bar, B);
and
(w2, B_bar, C_or_D);
and
(w3, C_or_D, B);
or (x, w1, w2);
or (w, w3, A);
endmodule
// part c 

module Behavior (input A, B, C, D, output reg w, x, y, z);
always @ (A, B, C, D) begin {w, x, y, z} = {A, B,C, D} + 4'b0011; end
endmodule

