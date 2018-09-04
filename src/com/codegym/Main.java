package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            Menu();
            System.out.println("Enter a choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter Fahrenheit: ");
                    double f = input.nextDouble();
                    System.out.println("Celsius: " + fahrenheitToCelsius(f));
                    break;
                }
                case 2: {
                    System.out.println("Enter Celsius: ");
                    double c = input.nextDouble();
                    System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
                    break;
                }
                case 0: {
                    System.exit(0);
                    break;
                }
            }
        } while (choice != 0);
    }

    public static void Menu() {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
