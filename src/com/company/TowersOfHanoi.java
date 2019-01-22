package com.company;

public class TowersOfHanoi {
    public double disks;
    public static String result;
    public  TowersOfHanoi(double d){
        disks = d;
    }
    public static void solution (int n, String peg1, String peg2, String peg3){
        if (n==0)
        {
            return;
        }

            solution(n - 1, peg1, peg3, peg2);
            System.out.println("Move disk " + n + " from " + peg1 + " to " + peg3);
            solution(n - 1, peg2, peg1, peg3);



    }
}
