package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemConsecutivePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        int sum;

        while (x != 0) {
            if (x % 2 == 0) {
                sum = 5 * x + 20;
            } else {
                sum = 5 * (x + 1) + 20;
            }
            System.out.println("SUM = " + sum);
            System.out.print("Enter an integer: ");
            x = scanner.nextInt();
        }

        scanner.close();
    }
}
