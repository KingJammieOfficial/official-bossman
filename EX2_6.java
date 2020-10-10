package com.company;

import java.util.Scanner;

public class EX2_6 {
    public static void main(String[] args) {
        System.out.println("\n Product of three numbers");
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;

        System.out.println("\nenter first number");
        num1 = input.nextInt();
        System.out.println("enter second number");
        num2 = input.nextInt();
        System.out.println("enter third number");
        num3 = input.nextInt();

        int product = num1 * num2 * num3;
        System.out.println("the product of the three variables is: "+product);

    }
}
