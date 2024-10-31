package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("FACTORIAL = " + factorial);

        scanner.close();
    }
}
