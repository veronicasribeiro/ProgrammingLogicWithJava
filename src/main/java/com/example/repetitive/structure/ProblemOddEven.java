package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = scanner.nextInt();

        int number;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number % 2 == 0 && number > 0) {
                System.out.println("POSITIVE PAIR");
            } else if (number % 2 == 0 && number < 0) {
                System.out.println("NEGATIVE PAIR");
            } else if (number % 2 != 0 && number < 0) {
                System.out.println("NEGATIVE ODD");
            } else if (number % 2 != 0) {
                System.out.println("ODD POSITIVE");
            } else {
                System.out.println("NULL");
            }
        }

        scanner.close();

    }
}
