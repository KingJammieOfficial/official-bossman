package com.company;


import java.util.Scanner;

public class EX2_33 {
    public static void main(String[] args) {
        Scanner jammie =new Scanner(System.in);
        System.out.println("\nB M C");
        int weight;
        int height;
        int BMI;
        System.out.println("input weight in pounds");
        weight = jammie.nextInt();
        System.out.println("input height in inches");
        height = jammie.nextInt();

        BMI = (weight * 703) / (height * height);
        System.out.printf("your BMI is %d%n", BMI);

        if (BMI < 18.5){
            System.out.println("Your BMI is Underweight\n");
            if (BMI >= 18.5 && BMI <= 24.9)
                System.out.println("Your BMI is Normal\n");
            if (BMI >= 25 && BMI <= 29.9)
                System.out.println("Your BMI is Overweight\n");
            if (BMI > 30)
                System.out.println("Your BMI is Obese\n");

            System.out.println("BMI Values");
            System.out.println("Underweight:\tless than 18.5");
            System.out.println("Normal:\t\tbetween 18.5 and 24.9");
            System.out.println("Overweight:\tbetween 25 and 29.9");
            System.out.println("Obese:\t\t30 or greater");
        }
        }



    }

