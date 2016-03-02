//Matthew O'Connor HW10 test bench for problem 5.50
// Student number 50000250

module testbench_problem_5_50;

   reg x, clk, rst;
   wire y, a, b, a1, b1;

   p5_50 test (y, a, b, x, a1, b1, clk, rst);

   initial
     begin
     rst = 0;
       clk = 0;
      #5 rst = 1;

       repeat (30)
       #5 clk = ~clk;
     end

  initial fork
   x=0;
   #2 x=1;
   #7 x=0;
   #9 x=1;
   join

    initial
      begin
        $monitor("ab = %b%b  x_in = %b  next_ab = %b%b  y_out = %b  clockk = %b  reset = %b",a, b, x, a1, b1, y, clk, rst);
        $dumpfile("p5_50.vcd");
        $dumpvars;
      end

endmodule
