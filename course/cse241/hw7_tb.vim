/Matthew O'Connor 4.49 tests Student # 50000250

module_t_4.41;

reg[3:0] E;
wire f1,f2;
Problem_4.49_MattO_HW7_Gates myC [E[3], E[2], E[1], E[0],f1,f2];

        initial
         begin
           E=4*b0000;
                repeat(15) #10 E-E +1*b1;
end

initial 
        #monitor("ABCD- %b f1=%b f2=%b", E, f1,f20);
endmodule

