// Matthew O'Connor
// Hw7 problem 4.49 A
// Student number 50000250

module Problem_4.49_MattO_HW7_Gates(output F1,F2, input A,B,C,D);
wire A_not=!A;
wire B_not=!B;
and (T1,B_not,C);
and(T2,A_not,B);
or (T3, A, T1);
xor (T4, T2, D);
or (F1, T3, T4);
or (F2, T2, D);
endmodule

