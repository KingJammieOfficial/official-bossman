package com.company;

import java.util.Scanner;

public class EX4_11 {
    public static void main(String[] args) {
        System.out.println("\nSMALLEST VALUE");

        Scanner king = new Scanner(System.in);
        int count;
        int smallest = 0;
        int i;

        System.out.print("enter the integers you wish to input: ");
        count = king.nextInt();
        for (i = 1; i <= count; i++) {
            System.out.print("enter number: ");
            int number = king.nextInt();
         if( smallest < number){
             smallest = number;
         }


        }
        System.out.printf("The smallest number is %d%n", smallest);
    }
}
