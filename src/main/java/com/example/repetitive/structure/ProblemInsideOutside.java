package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemInsideOutside {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers are you going to type? ");
        int n = scanner.nextInt();

        int numberInside = 0;
        int numberOutside = 0;
        int number;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter a number: ");
            number = scanner.nextInt();

            if (number >= 10 && number <= 20) {
                numberInside = numberInside + 1;
            } else {
                numberOutside = numberOutside + 1;
            }
        }

        System.out.println(numberInside + " INSIDE");
        System.out.println(numberOutside + " OUTSIDE");

        scanner.close();
    }
}
