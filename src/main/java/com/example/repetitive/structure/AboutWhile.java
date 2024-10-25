package com.example.repetitive.structure;

import java.util.Scanner;

public class AboutWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int x = scanner.nextInt();

        int sum = 0;
        while (x != 0) {
            sum = sum + x;
            System.out.print("Enter another number: ");
            x = scanner.nextInt();
        }

        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
