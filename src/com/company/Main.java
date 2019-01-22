package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner numOfMoves = new Scanner(System.in);
        System.out.println("Please input the number of disks to solve for: ");
        int  a = numOfMoves.nextInt();
        if (a >= 3 && a <= 9) {
            TowersOfHanoi.solution(a, "1st Pole ", "2nd Pole ", "3rd Pole ");
            }

        else {
            System.out.println("Invalid input your number must be between 3 and 9.");
            System.out.println("Please input the number of disks to solve for: ");
            Scanner numOfMoves2 = new Scanner(System.in);
            int b = numOfMoves2.nextInt();
            TowersOfHanoi.solution(b, "1st Pole ", "2nd Pole ", "3rd Pole ");

        }

    }
}
