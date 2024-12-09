package com.ecld.java.excercises;

public class StringEnd {
    public static void main(String[] args) {
        System.out.println(checkEnding("abc", "d"));
        System.out.println(checkEnding("abc", "bc"));
        System.out.println(checkEnding("feminine", "nine"));
    }

    public static boolean checkEnding(String str1, String str2) {
        if (str1.endsWith(str2)) {
            return true;
        }
        return false;
    }
}
