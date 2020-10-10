package com.company;

import java.util.Scanner;

public class EX4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.print("enter sales for the last week: ");
            double item = input.nextDouble();
            double comm = 200 + (item * 0.09);
            System.out.println(" your comm is: " + comm);

        }
    }

}
