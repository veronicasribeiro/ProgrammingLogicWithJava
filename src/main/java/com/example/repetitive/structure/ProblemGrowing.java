package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemGrowing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        while (number1 != number2) {
            if (number1 > number2) {
                System.out.println("DECREASING!");
            } else {
                System.out.println("GROWING!");
            }
            System.out.println("Enter two other numbers: ");
            number1 = scanner.nextInt();
            number2 = scanner.nextInt();
        }
    }
}
