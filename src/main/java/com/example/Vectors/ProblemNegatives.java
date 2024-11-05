package com.example.Vectors;

import java.util.Scanner;

public class ProblemNegatives {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = scanner.nextInt();

        int[] array = new int[10];

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("\nNEGATIVE NUMBERS:");

        for (int i = 0; i <= n - 1; i++) {
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
        }

        scanner.close();
    }
}
