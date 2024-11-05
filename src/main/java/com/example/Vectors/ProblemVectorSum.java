package com.example.Vectors;

import java.util.Scanner;

public class ProblemVectorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        double n = scanner.nextInt();

        double[] array = new double[10];

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextDouble();
        }

        double sum = 0;
        int count = 0;

        System.out.print("\nVALUES =");
        for (int i = 0; i <= n - 1 ; i++) {
            System.out.print(" " + array[i] + " "); // Prints the values on the same line
            sum = sum + array[i];
            count++;
        }

        double average = sum / count;

        System.out.println("\nSUM = " + sum);
        System.out.println("AVERAGE = " + average);

        scanner.close();

    }
}
