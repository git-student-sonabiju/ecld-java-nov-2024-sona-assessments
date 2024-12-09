package com.ecld.java.medium;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        System.out.println(reverse("world"));
        System.out.println(reverse("a"));
        System.out.println(reverse("") + "\"\" ");
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
