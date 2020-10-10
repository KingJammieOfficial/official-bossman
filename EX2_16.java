package com.company;

import java.util.Scanner;

public class EX2_16 {
    public static void main(String[] args) {
        System.out.println("\nCOMPARING INTEGERS");
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        System.out.println("input first number");
        num1 = input.nextInt();
        System.out.println("input second number");
        num2 = input.nextInt();

        if (num1 > num2){
            System.out.println("\n" + num1 + " is larger");}

        if (num1 < num2){
            System.out.println("\n" + num2 + " is larger");}

        if (num1 == num2){
            System.out.println("\nthey are equal");}

        }
    }

