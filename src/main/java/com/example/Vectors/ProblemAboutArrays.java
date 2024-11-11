package com.example.Vectors;

import java.util.Scanner;

public class ProblemAboutArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] array = new double[10]; // Declaration and initialization at the same time

        System.out.print("How many numbers will you type? ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("enter a number: ");
            array[i] = scanner.nextDouble();
        }

        System.out.println("\nTYPED NUMBERS");

        for (int i = 0; i <= n - 1; i++) {
            System.out.println(array[i]);
        }

        scanner.close();
    }
}
