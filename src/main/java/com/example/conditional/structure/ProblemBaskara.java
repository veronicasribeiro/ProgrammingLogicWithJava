package com.example.conditional.structure;

/*
    Problem: 'Baskara'
    Make a program to read the three coefficients of a quadratic equation.
    Using baskara's formula, calculate and display the values of the roots
    x1 and x2 of the equation with four decimal places. If the equation does
    not have real roots, display a message
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemBaskara {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        System.out.print("Coefficient A: ");
        double coefficientA = scanner.nextDouble();
        System.out.print("Coefficient B: ");
        double coefficientB = scanner.nextDouble();
        System.out.print("Coefficient C: ");
        double coefficientC = scanner.nextDouble();

        double discriminant = Math.pow(coefficientB,2) - 4 * coefficientA * coefficientC;

        double x1;
        double x2;
        double x;

        if (discriminant > 0) {
            x1 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA);
            x2 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA);
            String x1Format = df.format(x1);
            String x2Format = df.format(x2);
            System.out.println("X1 = " + x1Format);
            System.out.println("X2 = " + x2Format);
        } else if (discriminant == 0) {
            x = -coefficientB / (2 * coefficientA);
            String xFormat = df.format(x);
            System.out.println("Single real root: " + xFormat);
        } else {
            System.out.println("This equation has no real roots");
        }

        scanner.close();
    }
}
