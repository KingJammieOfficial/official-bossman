package com.company;

import java.util.Scanner;

public class EX2_24 {
    public static void main(String[] args) {
        System.out.println("\nLARGEST AND SMALLEST NUMBER");
        Scanner input = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.println("enter first number");
        num1 = input.nextInt();
        System.out.println("enter second number");
        num2 = input.nextInt();
        System.out.println("enter third number");
        num3 = input.nextInt();
        System.out.println("enter fourth number");
        num4 = input.nextInt();
        System.out.println("enter fifth number");
        num5 = input.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("\nfirst number is largest");}
        else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("\nsecond number is the largest");}
        else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("\nthird number is the largest");}
        else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("\nfourth number is the largest");}
        else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.println("\nfifth number is the largest");}

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("\nfirst number is smallest");}
        else if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println("\nsecond number is the smallest");}
        else if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("\nthird number is the snallest");}
        else if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("\nfourth number is the smallest");}
        else if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.println("\nfifth number is the smallest");}



        }

        }





