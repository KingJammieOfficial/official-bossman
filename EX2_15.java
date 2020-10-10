package com.company;

import java.util.Scanner;

public class EX2_15 {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;

        System.out.print("Enter  number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = input.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;

        System.out.printf("sum is%d%n", sum);
        System.out.printf("difference is%d%n", diff);
        System.out.printf("product is%d%n", product);
        System.out.printf("division is%d%n", div);
    }
}

