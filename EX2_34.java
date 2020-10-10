package com.company;

import java.util.Scanner;

public class EX2_34 {
    public static void main(String[] args) {
        System.out.println("WORLD POPULATION CALCULATOR");
        Scanner king = new Scanner(System.in);
        double worldpop;
        double popgrowth;
        System.out.println("enter the world population");
        worldpop = king.nextDouble();
        System.out.println("enter the population growth");
        popgrowth = king.nextDouble();

        System.out.printf("the worldpop for year 1 is: %f%n", worldpop * popgrowth);
        System.out.printf("the worldpop for year 2 is: %f%n", worldpop * popgrowth * popgrowth);
        System.out.printf("the worldpop for year 3 is: %f%n", worldpop * popgrowth * popgrowth * popgrowth);
        System.out.printf("the worldpop for year 4 is: %f%n", worldpop * popgrowth * popgrowth * popgrowth * popgrowth);
        System.out.printf("the worldpop for year 5 is: %f%n", worldpop * popgrowth * popgrowth * popgrowth * popgrowth *
                popgrowth);
        System.out.printf("the worldpop for year 6 is: %f%n", worldpop * popgrowth * popgrowth * popgrowth * popgrowth * popgrowth
                * popgrowth);


    }
}
