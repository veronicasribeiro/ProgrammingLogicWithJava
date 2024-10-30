package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemOddSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x,y);

        int oddsum = 0;

        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                oddsum = oddsum + i;
            }
        }

        System.out.println("ODD SUM = " + oddsum);
    }
}
