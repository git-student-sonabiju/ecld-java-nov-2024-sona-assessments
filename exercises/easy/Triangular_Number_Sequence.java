package com.ecld.java.excercises;

public class Triangle {
    public static void main(String[] args) {
        System.out.println(triangle(1));
        System.out.println(triangle(6));
        System.out.println(triangle(215));
    }

    public static int triangle(int n) {
        return n * (n + 1) / 2;
    }
}
