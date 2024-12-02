package com.ecld.java.verhard;

public class LetterDifference
{
    public static char findTheDifference(String s, String t) {
            // Initialize a variable to store the XOR result
            int result = 0;

            // XOR all characters in string s
            for (char c : s.toCharArray()) {
                result ^= c;
            }

            // XOR all characters in string t
            for (char c : t.toCharArray()) {
                result ^= c;
            }

            // Convert the final result back to a character
            return (char) result;
        }

        public static void main(String[] args) {
            System.out.println(findTheDifference("bcefg", "bcdefg")); // ➞ 'd'
            System.out.println(findTheDifference("abcd", "abcde"));   // ➞ 'e'
            System.out.println(findTheDifference("aiou", "aeiou"));   // ➞ 'e'
            System.out.println(findTheDifference("mnoqrst", "mnopqrst")); // ➞ 'p'
        }
}
