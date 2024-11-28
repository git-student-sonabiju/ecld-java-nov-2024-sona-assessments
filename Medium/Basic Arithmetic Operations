package com.ecld.java.medium;

public class Arithmetic {
    public static void main(String[] args) {
        System.out.println(operation("1", "2", "add"));
        System.out.println(operation("4", "5", "subtract"));
        System.out.println(operation("6", "0", "divide"));
        System.out.println(operation("6", "3", "divide"));
        System.out.println(operation("1", "2", "unknown"));
    }

    public static String operation(String a, String b, String op) {
        int n1 = Integer.parseInt(a);
        int n2 = Integer.parseInt(b);

        if (op == "add") {
            return String.valueOf(n1 + n2);
        }
        if (op == "subtract") {
            return String.valueOf(n1 - n2);
        }
        if (op == "divide") {
            if (n2 == 0) {
                return String.valueOf(Integer.MIN_VALUE);
            }
            return String.valueOf(n1 / n2);
        }
        if (op == "multiply") {
            return String.valueOf(n1 * n2);
        }
        return "Invalid Operation";
    }
}
