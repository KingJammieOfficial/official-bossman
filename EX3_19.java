package com.company;

import java.util.Scanner;

public class EX3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int item1;
        int item2;
        int item3;
        int item4;
        double total = 0;
        int counter = 1;

        while(counter != -1)
        {
            System.out.print("Enter number sold of first item: ");
            item1 = input.nextInt();
            total += (double)(item1 * 239.99);
            System.out.print("Enter number sold of second item: ");
            item2 = input.nextInt();
            total+= (double)(item2 * 129.75);
            System.out.print("Enter number sold of third item: ");
            item3 = input.nextInt();
            total += (double)(item3 * 99.95);
            System.out.print("Enter number sold of fourth item: ");
            item4 = input.nextInt();
            total += (double)(item4 * 350.89);

            System.out.printf("Total earning for the week: $%.2f%n", (total * .09 + 200));
            System.out.print("Enter 1 to calculate more earnings or -1 to quit: ");
            counter = input.nextInt();
        }
    }


    }

