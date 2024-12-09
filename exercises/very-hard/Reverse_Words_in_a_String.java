package com.ecld.java.verhard;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        System.out.println(reverseWords(str));
        sc.close();

//        System.out.println(reverseWords("the sky is blue"));
//        System.out.println(reverseWords("  hello world!  "));
//        System.out.println(reverseWords("a good   example"));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        // Reverse the order of words and join them back into a string
        String reversedString = "";
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString += words[i] + " ";
        }
        return reversedString;
    }
}
