package com.company;

import java.util.Scanner;

public class EX4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pay;
        for (int i = 1; i <= 3; i++) {
            System.out.println("enter hours worked last week");
            int hours = input.nextInt();
            System.out.println("enter hourly rates");
            int rate = input.nextInt();
            if (hours == 40){
                pay = hours * rate;
                System.out.println(" you worked straight 40 hours so you'll be paid"+pay);}
            else if(hours>40){
                int extraHours = hours - 40;
                pay = (40*rate) + (extraHours*rate);
                System.out.println("you worked more than 40 hours so you'll be paid"+pay);}





            }

        }
    }

