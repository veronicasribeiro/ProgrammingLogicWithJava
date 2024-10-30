package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemMultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What value do you want the multiplication table for? ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }

        scanner.close();

    }
}
