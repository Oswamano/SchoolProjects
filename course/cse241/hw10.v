//Matthew O'Connor Homework Number 10 Student number 50000250
module problem_5_50(y, a, b, x, a1, b1, clk, rst);
input x, clk, rst;
output  a, b, a1, b1 ;
output reg y;
reg[1:0] state, state1;
assign a = state[1];
assign a1 = state1[1];
assign b = state[0];
assign b1 = state1[0];
parameter s0=2'b00, s1=2'b01, s2=2'b10, s3=2'b11;
 always@(posedge clk, negedge rst)
      if(rst==0) state <= s0;
      else state <= state1;


 always@(state, x) begin
    y = 0;
    state1 = s0;
      case(state)
          s0: if(x==1) begin state1 <= s1; y = 0; end
                  else begin state1 <= s0; y = 0; end
          s1: if(x==1) begin state1 <= s2; y = 1; end
                  else begin state1 <= s0; y = 0; end
          s2: if(x==1) begin state1 <= s3; y = 1; end
                  else begin state1 <= s0; y = 0; end
          s3: if(x==1) begin state1 <= s0; y = 0; end
                  else begin state1 <= s0; y = 0; end
          default: state1 = 2'bxx;
      endcase
    end
