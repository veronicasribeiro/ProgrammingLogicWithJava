package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AboutDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        double c, f;
        String response;

        do {
            System.out.print("Enter the temperature in Celsius: ");
            c = scanner.nextDouble();
            f = 9 * c / 5 + 32;
            String fFormat = df.format(f);
            System.out.println("Equivalent to fahrenheit: " + fFormat);
            System.out.print("Do you want to repeat? (y/n) ");
            response = scanner.next();
        } while (response.equalsIgnoreCase("y"));

        scanner.close();
    }
}
