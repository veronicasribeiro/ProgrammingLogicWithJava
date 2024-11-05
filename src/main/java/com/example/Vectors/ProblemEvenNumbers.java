package com.example.Vectors;

import java.util.Scanner;

public class ProblemEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = scanner.nextInt();

        int[] arrayN = new int[n];
        int[] isEven = new int[n];
        int countEven = 0;
        int totalEven = 0;

        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Enter a number: ");
            arrayN[i] = scanner.nextInt();

            if (arrayN[i] % 2 == 0) {
                isEven[countEven] = arrayN[i];
                countEven++;
                totalEven++;
            }
        }

        System.out.println("\nNUMBERS EVEN:");

        for (int i = 0; i < countEven; i++) {
            System.out.print(isEven[i] + " ");
        }

        System.out.println("\n\nNUMBER OF PAIRS = " + totalEven);

        scanner.close();
    }
}
