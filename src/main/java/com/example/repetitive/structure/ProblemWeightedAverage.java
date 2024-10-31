package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemWeightedAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0");

        System.out.print("How many cases will you type? ");
        int n = scanner.nextInt();

        double number1;
        double number2;
        double number3;
        double average;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter three numbers: ");
            number1 = scanner.nextDouble();
            number2 = scanner.nextDouble();
            number3 = scanner.nextDouble();

            average = (number1 * 2 + number2 * 3 + number3 * 5) / (2 + 3 + 5);

            String averageFormat = df.format(average);
            System.out.println("AVERAGE = " + averageFormat);
        }
    }
}
