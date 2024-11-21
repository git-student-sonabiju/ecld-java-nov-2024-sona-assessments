package com.ecld.java.assesment;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("Choose operation: \n1. Add (+) \n2. Subtract (-) \n3. Multiply (*) \n4. Divide (/)");
        System.out.print("Enter choice: ");
        double choice = scanner.nextDouble();
        if (choice == 1) {
            System.out.println(add(num1, num2));
        } else if (choice == 2) {
            System.out.println(subtract(num1, num2));
        } else if (choice == 3) {
            System.out.println(multiply(num1, num2));
        } else if (choice == 4) {
            System.out.println(divide(num1, num2));
        } else {
            System.out.println("invalid");
        }

    }
}
