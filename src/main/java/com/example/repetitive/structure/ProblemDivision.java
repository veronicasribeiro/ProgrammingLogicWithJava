package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many cases are you going to type? ");
        int n = scanner.nextInt();

        double numerator;
        double denominator;
        double division;


        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextDouble();
            System.out.print("Entre com o denominador: ");
            denominator = scanner.nextDouble();

            if (denominator == 0) {
                System.out.println("IMPOSSIBLE DIVISION");
            } else {
                division = numerator / denominator;

                String divisionFormat = df.format(division);

                System.out.println("DIVISION = " + divisionFormat);
            }
        }

        scanner.close();
    }
}
