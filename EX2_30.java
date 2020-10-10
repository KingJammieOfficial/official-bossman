package com.company;

import java.util.Scanner;

public class EX2_30 {
    public static void main(String[] args) {
        System.out.println("SEPARATE INTEGERS");

        Scanner king = new Scanner(System.in);
        int number;
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;

        System.out.print("Enter a five digit number: ");
        number = king.nextInt();

        digit1 = number / 10000;
        number = number % 10000;
        digit2 = number / 1000;
        number = number % 1000;
        digit3 = number / 100;
        number = number % 100;
        digit4 = number / 10;
        digit5 = number % 10;

        System.out.printf("The digits are %d %d %d %d %d%n", digit1, digit2,
                digit3, digit4, digit5);
    }
}


