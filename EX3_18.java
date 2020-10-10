package com.company;

import java.util.Scanner;

public class EX3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int account;
        int beginBalance;
        int charges;
        int credits;
        int creditLimit;
        int newBalance;

        System.out.print("Enter account number or -1 to quit: ");
        account = input.nextInt();

        while (account != -1)
        {
            System.out.print("Enter beginning monthly balance: ");
            beginBalance = input.nextInt();
            System.out.print("Enter all charges: ");
            charges = input.nextInt();
            System.out.print("Enter credits applied this month: ");
            credits = input.nextInt();
            System.out.print("Enter credit limit: ");
            creditLimit = input.nextInt();

            newBalance = beginBalance + charges - credits;

            System.out.printf("%nAccount number: %d%n", account);
            System.out.printf("Beginning Balance: %d%n", beginBalance);
            System.out.printf("Charges: %d%n", charges);
            System.out.printf("Credits: %d%n", credits);
            System.out.printf("Credit Limit: %d%n", creditLimit);
            System.out.printf("Final Balance: %d%n", newBalance);


            if (newBalance > creditLimit)
            {
                System.out.println("Credit limit exceeded");
            }
            else
            {
                System.out.println("You are within your credit limit.");
            }

            System.out.print("Enter next account number or -1 to quit: ");
            account = input.nextInt();
        }
    }
}


