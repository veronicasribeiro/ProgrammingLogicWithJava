package com.example.Vectors;

import java.util.Scanner;

public class ProblemAddVectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values will each vector have? ");
        int n = scanner.nextInt();

        int[] valuesA = new int[n];

        System.out.println("Enter the values of vector A: ");
        for (int i = 0; i <= n - 1; i++) {
            valuesA[i] = scanner.nextInt();
        }

        int[] valuesB = new int[n];

        System.out.println("Enter the values of vector B: ");
        for (int i = 0; i <= n - 1; i++) {
            valuesB[i] = scanner.nextInt();
        }


        System.out.println("\nRESULTING VECTOR: ");
        for (int i = 0; i <= n - 1; i++) {
            int sum = valuesA[i] + valuesB[i];
            System.out.println(sum);
        }

        scanner.close();
    }
}
