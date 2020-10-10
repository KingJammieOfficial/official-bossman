package com.company;



import java.util.Scanner;

public class EX2_17 {
    public static void main(String[] args) {
        System.out.println("\n\nCOMPARING INTEGERS");
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;

        System.out.println("Enter first number");
        number1 = input.nextInt();
        System.out.println("Enter second number");
        number2 = input.nextInt();
        System.out.println("Enter third number");
        number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println("the sum is: "+sum);
        int diff = number1 - number2 - number3;
        System.out.println("the diff is: "+diff);
        int product = number1 * number2 * number3;
        System.out.println("the product is: "+product);
        maximum(number1,number2,number3);
        System.out.println("the maximum is: "+maximum(number1,number2,number3));
        int min = Math.min(number1, number2);
        int minn = Math.min(min, number3);
        System.out.println("the minimum is: "+minn);




    }
    public static int maximum(int number1, int number2, int number3){
        int maxx = Math.max(number1,Math.max(number2,number3));
        return maxx;
    }
}
