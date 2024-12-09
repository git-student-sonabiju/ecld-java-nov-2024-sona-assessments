package com.ecld.java.excercises;
public class TrueFalse {
    public static void main(String[] args) {
        System.out.println(countTrue(new boolean[]{true, false, false, true, false}));
        System.out.println(countTrue(new boolean[]{false, false, false, false}));
        System.out.println(countTrue(new boolean[]{}));
    }

    public static int countTrue(boolean[] arr) {
        int sum = 0;
        for (boolean value : arr) {
            if (value) {
                sum++;
            }
        }
        return sum;
    }
}
