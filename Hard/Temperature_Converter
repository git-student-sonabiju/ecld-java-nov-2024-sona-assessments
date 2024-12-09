package com.ecld.java.hard;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        System.out.println("Enter degree in celsius or fahrenheit: ");
        Scanner sc = new Scanner(System.in);
        String degree = sc.nextLine();
        System.out.println(convert(degree));
        sc.close();

//        System.out.println(convert("35*C"));
//        System.out.println(convert("19*F"));
//        System.out.println(convert("33"));
    }

    public static String convert(String deg) {
        if (!deg.contains("*") || (deg.charAt(deg.length() - 1) != 'C' && deg.charAt(deg.length() - 1) != 'F')) {
            return "Error: Invalid format. Please use *C for Celsius or *F for Fahrenheit.";
        }
        int idx = deg.indexOf('*');
        if (deg.charAt(deg.length() - 1) == 'C') {
            try {
                int cel = Integer.parseInt(deg.substring(0, idx));
                int fah = (int) Math.round(cel * 1.8 + 32);   //converting celsius to fahrenheit
                return fah + "*F";
            } catch (NumberFormatException e) {
                return "Error: Invalid number format.";
            }
        } else if (deg.charAt(deg.length() - 1) == 'F') {
            try {
                int fah = Integer.parseInt(deg.substring(0, idx));
                int cel = (int) Math.round((fah - 32) / 1.8);  //converting fahrenheit to celsius
                return cel + "*C";
            } catch (NumberFormatException e) {
                return "Error: Invalid number format.";
            }
        } else
            return "Error: Invalid format. Please use *C for Celsius or *F for Fahrenheit.";
    }
}
