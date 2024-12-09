package com.ecld.java.assesment;
import java.util.InputMismatchException;
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
        for (int i = 1; i <= 5; i++) {

            try {
                System.out.printf("Enter number %d: ", i);
                int num = scanner.nextInt();
                System.out.printf("Number %d is:\n", num);
                analyzeNumber(num);

            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number");
                scanner.next();
            }
        }
        scanner.close();
    }
}
