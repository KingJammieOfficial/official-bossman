package com.company;

import java.util.Scanner;

public class EX2_32 {
    public static void main(String[] args) {
        System.out.println("NEGATIVE POSITIVE ZERO");
        Scanner king =new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        System.out.print("Enter first integer: ");
        num1 = king.nextInt();
        System.out.print("Enter second integer: ");
        num2 = king.nextInt();
        System.out.print("Enter third integer: ");
        num3 = king.nextInt();
        System.out.print("Enter fourth integer: ");
        num4 = king.nextInt();
        System.out.print("Enter fifth integer: ");
        num5 = king.nextInt();

        if (num1 > 0)
            positive = positive + 1;
        if (num2 > 0)
            positive = positive + 1;
        if (num3 > 0)
            positive = positive + 1;
        if (num4 > 0)
            positive = positive + 1;
        if (num5 > 0)
            positive = positive + 1;

        if (num1 < 0)
            negative = negative + 1;
        if (num2 < 0)
            negative = negative + 1;
        if (num3 < 0)
            negative = negative + 1;
        if (num4 < 0)
            negative = negative + 1;
        if (num5 < 0)
            negative = negative + 1;

        if (num1 == 0)        // Determine numbe of zeros
            zero = zero + 1;
        if (num2 == 0)
            zero = zero + 1;
        if (num3 == 0)
            zero = zero + 1;
        if (num4 == 0)
            zero = zero + 1;
        if (num5 == 0)
            zero = zero + 1;

        System.out.printf("Number of positive numbers: %d%n", positive);
        System.out.printf("Number of negative numbers: %d%n", negative);
        System.out.printf("Number of zeros: %d%n", zero);

    }
}

