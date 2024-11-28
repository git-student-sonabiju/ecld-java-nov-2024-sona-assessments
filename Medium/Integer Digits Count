package com.ecld.java.medium;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to  be counted:");
        int a = sc.nextInt();
        System.out.println(count(a));
        sc.close();
        
//        System.out.println(count(4666));
//        System.out.println(count(544));
//        System.out.println(count(318));
//        System.out.println(count(-92563));
//        System.out.println(count(-314890));
//        System.out.println(count(654321));
//        System.out.println(count(638476));
    }

    public static int count(int n) {
        if (n == 0) {
            return 1;
        }
        n = Math.abs(n);
        int count = 0;
        while (n > 0) {
            n /= 10;  // Remove the last digit
            count++;  // Increment the digit count
        }
        return count;
    }
}
