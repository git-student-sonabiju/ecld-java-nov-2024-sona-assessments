package com.ecld.java.medium;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4})); // ➞ 10
        System.out.println(sum(new int[]{1, 2})); // ➞ 3
        System.out.println(sum(new int[]{1})); // ➞ 1
        System.out.println(sum(new int[]{})); // ➞ 0
    }

    public static int sum(int[] arr) {
        return recursiveSum(arr, arr.length - 1);
    }

    private static int recursiveSum(int[] arr, int index) {
        if (index < 0) {
            return 0;
        }
        // Recursive case: Return the current element + sum of the rest
        return arr[index] + recursiveSum(arr, index - 1);
    }
}
