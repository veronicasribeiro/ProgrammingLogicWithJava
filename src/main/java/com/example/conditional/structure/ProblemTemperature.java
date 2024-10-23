package com.example.conditional.structure;

/*
    Problem: 'Temperature'
    You want to convert a temperature measurement from the Celsius scale to
    Fahrenheit or Celsius to Fahrenheit. To do this, you must create a program
    that reads the letter "C" or "F' indicating which scale a temperature
    will be entered in. The program must then display the temperature in the
    other scale with two decimal places.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("What scale will you enter the temperature in (C/F)? ");
        String scale = scanner.nextLine();

        if (scale.equalsIgnoreCase("f")) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double temperatureF = scanner.nextDouble();
            double temperatureConvertedToC = 5.0 / 9.0 * (temperatureF - 32);
            String temperatureConvertedToCFormat = df.format(temperatureConvertedToC);
            System.out.println("Equivalent temperature in Celsius: " + temperatureConvertedToCFormat);
        } else if (scale.equalsIgnoreCase("c")) {
            System.out.print("Enter the temperature in Celsius: ");
            double temperatureC = scanner.nextDouble();
            double temperatureConvertedToF = (temperatureC * 9 / 5) + 32;
            String temperatureConvertedToFFormat = df.format(temperatureConvertedToF);
            System.out.println("Equivalent temperature in Fahrenheit: " + temperatureConvertedToFFormat);
        }

        scanner.close();

    }
}
