package com.company;

import java.util.Scanner;

public class EX3_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int miles;
        int gallon;
        int totalmiles = 0;
        int totalgallon = 0;

        System.out.print("Enter miles for trip or -1 to quit: ");
        miles = input.nextInt();

        while (miles != -1) {
            totalmiles += miles;
            System.out.print("Enter gallons of gas used: ");
            gallon = input.nextInt();
            totalgallon += gallon;

            System.out.printf("Miles driven for this trip: %d%n", miles);
            System.out.printf("Gallons used on this trip: %d%n", gallon);
            System.out.printf("Average mpg on this trip: %f%n", (double) miles / gallon);
            System.out.printf("Average mpg overall: %f%n", (double) totalmiles / totalgallon);

            System.out.print("Enter miles for next trip or -1 to quit: ");
            miles = input.nextInt();

        }
    }
}

