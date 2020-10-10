package com.company;

import java.util.Scanner;

public class Ex4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 1;
        System.out.print("enter num of persons");
        int num = input.nextInt();
        while (x <= num) {

            System.out.print("enter the account number");
            int account = input.nextInt();

            System.out.print("enter the balance at the beginning of the month");
            int bal = input.nextInt();

            System.out.print("enter total of all items charged by customer this month");
            int total = input.nextInt();

            System.out.print("enter total of all credits applied to customers account this month");
            int creditApplied = input.nextInt();

            System.out.print("enter allowed credit limit");
            int creditLimit = input.nextInt();

            int newBal = bal + total + creditApplied;
            int creditAllowed = 5000;

            System.out.println("newBal is: " + newBal);
            System.out.println();


            if (newBal > creditAllowed) {
                System.out.println("credit limit exceeded");
                System.out.println();
            }
            x = x + 1;


        }
    }

}