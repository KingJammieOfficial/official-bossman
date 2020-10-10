package com.company;

import java.util.Scanner;

public class EX2_26 {
    public static void main(String[] args) {
        System.out.println("MULTIPLES");
        Scanner king = new Scanner(System.in);
        int x;
        int y;
        System.out.println("\nenter the first number");
        x = king.nextInt();
        System.out.println("\nenter second number");
        y = king.nextInt();
        if (y % x == 0){
            System.out.println("the first integer is a multiple of the second number");}
            else{
            System.out.println("the first integer is not a multiple of the second");
        }
        
    }
}
