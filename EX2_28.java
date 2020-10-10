package com.company;

import java.util.Scanner;

public class EX2_28 {
    public static void main(String[] args) {
        System.out.println("Diameter, Circumference and Area of a Circle");
        Scanner input =new Scanner(System.in);
        double radius;
        System.out.print("enter radius: ");
        radius = input.nextInt();
        System.out.println();
        System.out.println();
        System.out.printf("Diameter = %.1f%n", radius);
        System.out.printf("Circumference = %.1f%n", 2 * Math.PI * radius);
        System.out.printf("Area = %.1f", Math.PI * Math.pow(radius, 2));
    }
}
