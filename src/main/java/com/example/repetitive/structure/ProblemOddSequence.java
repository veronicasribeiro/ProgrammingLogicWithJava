package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemOddSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter X value: ");
        int x = scanner.nextInt();

        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
