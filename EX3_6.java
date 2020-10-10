package com.company;

import java.util.Scanner;

public class EX3_6 {
    public static void main(String[] args) {
        System.out.println("CALCULATE");

        int c = 5;
        System.out.printf("c before postincrement: %d%n", c);
        System.out.printf("    postincrementing c: %d%n", c++);
        System.out.printf(" c after postincrement: %d%n", c);

        System.out.println();

        c = 5;
        System.out.printf(" c before preincrement: %d%n", c);
        System.out.printf("     preincrementing c: %d%n", ++c);
        System.out.printf("  c after preincrement: %d%n", c);

    }
}
