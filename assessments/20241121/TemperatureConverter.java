package com.ecld.java.assesment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String[] args) {
        TemperatureConverter temp = new TemperatureConverter();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius \n3. Exit ");

                System.out.print("Choose option: ");
                int num = scanner.nextInt();
                switch (num) {
                    case 1:
                        System.out.print("Enter temperature in celsius: ");
                        double celsius = scanner.nextDouble();
                        System.out.printf("%.1f°C = %.1f°F%n",
                                celsius, temp.celsiusToFahrenheit(celsius));
                        break;
                    case 2:
                        System.out.print("Enter temperature in fahrenheit: ");
                        double fahrenheit = scanner.nextDouble();
                        System.out.printf("%.1f°F = %.1f°C%n",
                                fahrenheit, temp.fahrenheitToCelsius(fahrenheit));
                        break;
                    case 3:
                        System.out.println("Exiting the program");
                        scanner.close();
                        return;
                    default:
                        System.out.println("invalid option");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid temperature");
                scanner.next();
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius)
    {
        return (((celsius * 9) / 5) + 32);
    }

    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (((fahrenheit - 32) * 5) / 9);
    }
}
