package com.ecld.java.assesment;

import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String[] args)
    {
        TemperatureConverter temp = new TemperatureConverter();
            System.out.println("1. Convert Celsius to Fahrenheit \n2. Convert Fahrenheit to Celsius \n3. Exit ");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Choose option: ");
            int num = scanner.nextInt();
            switch (num)
            {
                case 1:
                    System.out.print("Enter temperature in celsius: ");
                    double celsius = scanner.nextDouble();
                    System.out.println(celsius + "°C = " + temp.celsiusToFahrenheit(celsius) + "°F");
                    break;
                case 2:
                    System.out.print("Enter temperature in fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    System.out.println(fahrenheit + "°F = " + temp.fahrenheitToCelsius(fahrenheit) + "°C");
                    break;
                case 3:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("invalid value");
                    break;
            }
    }

    public double celsiusToFahrenheit(double celsius) {
        return (((celsius * 9) / 5) + 32);
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (((fahrenheit - 32) * 5) / 9);
    }
}