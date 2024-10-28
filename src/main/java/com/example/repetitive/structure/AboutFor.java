package com.example.repetitive.structure;

import java.util.Scanner;

public class AboutFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, x, sum = 0;

        System.out.print("How many numbers will be entered? ");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            x = scanner.nextInt();
            sum = sum + x;
        }

        System.out.println("SUM = " + sum);

        scanner.close();
    }
}
