package com.ecld.java.hard;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        System.out.println("Number of prime upto " + a + " is " + primeNumbers(a));
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int primeNumbers(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
}
