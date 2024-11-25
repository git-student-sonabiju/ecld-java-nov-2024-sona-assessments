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
        if(b==0)
        {
            throw new ArithmeticException("Cannot divide by zero");
        }
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
        int choice = scanner.nextInt();
        switch(choice)
        {
            case 1:
                System.out.printf("%.2f + %.2f = %.2f%n",
                        num1, num2, add(num1, num2));
                break;
            case 2:
                System.out.printf("%.2f - %.2f = %.2f%n",
                        num1, num2, subtract(num1, num2));
                break;
            case 3:
                System.out.printf("%.2f * %.2f = %.2f%n",
                        num1, num2, multiply(num1, num2));
                break;
            case 4:
                System.out.printf("%.2f / %.2f = %.2f%n",
                        num1, num2, divide(num1, num2));
                break;
            default:
                System.out.println("invalid option");
                break;
        }
        scanner.close();
    }
}
