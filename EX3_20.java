package com.company;

import java.util.Scanner;

public class EX3_20 {
    public static void main(String[] args) {
        System.out.println("\nSALARY");
        Scanner input = new Scanner(System.in);
        int hours;
        double rate;
        double salary;

        System.out.println("enter the number of hours worked");
        hours = input.nextInt();
        while (hours != -1) {

        }
        System.out.println("enter the hourly wage rate");
        rate = input.nextDouble();

        if (hours <= 40) {

            salary = hours * rate;
            System.out.printf("overall earnings is: $%.2f%n", salary);
        }
        else
        {
            salary = (rate * 40) + ((hours - 40) * (rate * 1.5));
            System.out.printf("overall earnings is:$%.2f%n%n", salary);
        }

        System.out.println("enter hours workred");
        hours = input.nextInt();


    }
}
