package com.company;

import java.util.Scanner;

public class EX4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input number of integers");
        int Counter = 1;
        int largest = 0;
        int number;

        System.out.print("enter ten number: ");
        int num = input.nextInt();
        num = largest;


        while(Counter < 10) {
            System.out.print("enter number: ");
            number = input.nextInt();

            if(number > largest) {
               largest = number;
            }

            Counter = Counter + 1;
        }


        System.out.println("largest number is:" +largest);
        }


    }

