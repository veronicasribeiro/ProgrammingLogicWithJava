package com.example.Vectors;

import java.util.Scanner;

public class ProblemHighestPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = scanner.nextInt();

        double[] array = new double[n];

        System.out.print("Enter a number: ");
        array[0] = scanner.nextDouble();

        double highestValue = array[0];
        int highestIndex = 0;

        for (int i = 1; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextDouble();

            if (array[i] > highestValue) {
                highestValue = array[i];
                highestIndex = i;
            }
        }

        System.out.println("\nHIGHER VALUE = " + highestValue);
        System.out.println("POSITION OF HIGHEST VALUE = " + highestIndex);

        scanner.close();
    }
}
