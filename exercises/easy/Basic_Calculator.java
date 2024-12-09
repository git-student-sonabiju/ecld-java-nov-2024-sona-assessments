package com.ecld.java.excercises;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '-', 2));
        System.out.println(calculator(2, '*', 2));
        System.out.println(calculator(2, '/', 2));
        System.out.println(calculator(2, '/', 0));
    }

    public static int calculator(int num1, char operator, int num2) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if(num2 == 0) return 0;
                else
                    return num1 / num2;
            default:
                return 0;

        }
    }
}
