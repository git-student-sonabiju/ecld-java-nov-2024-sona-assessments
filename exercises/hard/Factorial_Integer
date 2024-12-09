package com.ecld.java.hard;

public class InputFactorial {
    public static void main(String[] args) {
        System.out.println(isFactorial(2));
        System.out.println(isFactorial(27));
        System.out.println(isFactorial(24));
    }

    public static boolean isFactorial(int n) {
        int i = 1;
        while (n > 1) {
            if (n % i != 0) {
                return false;
            }
            n /= i;
            i++;
        }
        return n == 1;
    }
}

// using recursion

//public class InputFactorial {
//    public static void main(String[] args) {
//        System.out.println(isFactorial(120));
//        System.out.println(isFactorial(50));
//    }
//
//    public static boolean isFactorial(int n) {
//        if (n <= 2) return true;
//        for (int i = 1; i <= n / 2; i++) {
//            if (factorial(i) == n) return true;
//        }
//        return false;
//    }
//
//    public static int factorial(int n) {
//        if (n == 1) return 1;
//        return n * factorial(n - 1);
//    }
//}
