package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner numOfMoves = new Scanner(System.in);
        System.out.println("Please input the number of disks to solve for: ");
        int a = numOfMoves.nextInt();
        if (a >= 3 && a <= 9) {
            TowersOfHanoi solution = new TowersOfHanoi(a);
        }
        else {
            System.out.println("Invalid input your number must be between 3 and 9.");
            System.out.println("Please input the number of disks to solve for: ");
            int b = numOfMoves.nextInt();
            TowersOfHanoi solution = new TowersOfHanoi(b);
        }

    }
}
