package com.ecld.java.medium;

public class Calculator2 {
    public static void main(String[] args) {
        System.out.println(basicCalculator(2, "+", 4));
        System.out.println(basicCalculator(6, "-", 5));
        System.out.println(basicCalculator(12, "/", 3));
        System.out.println(basicCalculator(3, "*", 4));
        System.out.println(basicCalculator(1, "/", 0));
        System.out.println(basicCalculator(1, "x", 0));

    }

    public static Object basicCalculator(int a, String o, int b) {
        if (o == "+") return a + b;
        if (o == "-") return a - b;
        if (o == "/" && b != 0) return a / b;
        if (o == "*") return a * b;
        return null;
    }
}
