package com.ecld.java.assesment;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void analyzeNumber(int num) {
        if (num > 0) {
            System.out.println("- Positive");
        } else if (num < 0) {
            System.out.println("- Negative");
        } else {
            System.out.println("- Zero");
        }
        if (num % 2 == 0) {
            System.out.println("- Even");
        } else {
            System.out.println("- Odd");
        }
        if (num % 5 == 0) {
            System.out.println("- Multiple of 5");
        } else {
            System.out.println("- Not a multiple of 5");
        }
    }

    public static void main(String[] args) {
        System.out.println("Number Analyzer");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num = scanner.nextInt();
        System.out.printf("Number %d is:\n", num);
        analyzeNumber(num);

        System.out.print("Enter number 2: ");
        num = scanner.nextInt();
        System.out.printf("Number %d is:\n", num);
        analyzeNumber(num);

        System.out.print("Enter number 3: ");
        num = scanner.nextInt();
        System.out.printf("Number %d is:\n", num);
        analyzeNumber(num);

        System.out.print("Enter number 4: ");
        num = scanner.nextInt();
        System.out.printf("Number %d is:\n", num);
        analyzeNumber(num);

        System.out.print("Enter number 5: ");
        num = scanner.nextInt();
        System.out.printf("Number %d is:\n", num);
        analyzeNumber(num);
    }
}
