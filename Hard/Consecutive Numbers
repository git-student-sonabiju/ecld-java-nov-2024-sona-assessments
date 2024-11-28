package com.ecld.java.hard;

import java.util.Arrays;

public class ConsecutiveNum {
    public static void main(String[] args) {
        System.out.println(cons(new int[]{5, 1, 4, 3, 2}));
        System.out.println(cons(new int[]{5, 1, 4, 3, 2, 8}));
        System.out.println(cons(new int[]{5, 6, 7, 8, 9, 9}));
    }

    public static boolean cons(int[] arr) {
        if (arr == null || arr.length < 2) {
            return true;
        }

        // Sort the array
        Arrays.sort(arr);

        // Check for duplicates and check the consecutive property
        for (int i = 1; i < arr.length; i++) {
            // If two consecutive elements are the same, it's not a valid sequence
            if (arr[i] == arr[i - 1]) {
                return false;
            }
            // Check if the difference between consecutive numbers is 1
            if (arr[i] - arr[i - 1] != 1) {
                return false;
            }
        }

        return true; 
    }
}
