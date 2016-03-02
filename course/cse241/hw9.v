nput E, F, clock, reset_b);
 parameter s0 = 2'b00, s1 = 2'b01, s2 = 2'b10, s3 = 2'b11;
 reg [1: 0] state, next_state;

 always @ (posedge clock, negedge reset_b)
	if (reset_b == 0) state <= s0;
	else state <= next_state;

 always @ (state, E, F) begin
	next_state = s0;

 case (state)
s0:	if (E == 0) next_state = s0;
   else if (F == 1) next_state = s1; else next_state = s3;
s1: if (E == 0) next_state = s1;
   else if (F == 1) next_state = s2; else next_state = s0;
s2: if (E == 0) next_state = s2;
   else if (F == 1) next_state = s3; else next_state = s1;
s3: if (E == 0) next_state = s3;
   else if (F == 1) next_state = s0; else next_state = s2;
default: next_state = s0;
endcase
end
endmodule

module test;
reg E, F, clk, reset_b;
test M0 ( E, F, clk, reset_b);
initial #350$finish;
initial begin clk = 0; forever #5 clk = ~clk; end
initial fork
#2 reset_b = 1;
#3 reset_b = 0;
#4 reset_b = 1;
#2 E = 0;
#20 begin E = 1; F = 1; end
#60 E = 0;
#80 E = 1;
#90 E = 0;
#110 E = 1;
#120 E = 0;
#140 E = 1;
#150 E = 0;
#170 E= 1;
#170 F = 0;
join
endmodule









o
