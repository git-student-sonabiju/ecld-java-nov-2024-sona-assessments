package com.ecld.java.hard;

import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = sc.next();
        System.out.println(isPalindrome(word));

//        System.out.println(isPalindrome("madam"));
//        System.out.println(isPalindrome("adieu"));
//        System.out.println(isPalindrome("rotor"));

    }

    public static boolean isPalindrome(String wrd) {
        if (wrd.length() <= 1) {
            return true;
        }
        if (wrd.charAt(0) != wrd.charAt(wrd.length() - 1)) {
            return false;
        }
        return isPalindrome(wrd.substring(1, wrd.length() - 1));
    }
}
