package com.company;

import java.util.Scanner;

public class EX2_35 {
    public static void main(String[] args) {
        System.out.println("DRIVING COST");
        Scanner king = new Scanner(System.in);

        int drivingCost;
        int milesDriven;
        int gasolineCost;
        int averageMiles;
        int parkingFees;
        int tolls;

        System.out.println("\nenter miles driven per day");
        milesDriven = king.nextInt();
        System.out.println("\nenter gasoline cost per gallon");
        gasolineCost = king.nextInt();
        System.out.println("\nenter average miles per gallon");
        averageMiles = king.nextInt();
        System.out.println("\nenter parking fees per day");
        parkingFees = king.nextInt();
        System.out.println("\n tolls per day");
        tolls = king.nextInt();

        drivingCost = ((milesDriven / averageMiles) * gasolineCost) + parkingFees
                + tolls;
        System.out.printf("\nAverage driving cost per day: %d%n", drivingCost);
    }
}
