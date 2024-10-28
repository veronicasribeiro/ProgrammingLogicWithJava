package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the X and Y coordinate values: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("QUADRANT Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("QUADRANT Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("QUADRANT Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("QUADRANT Q4");
            }
            System.out.println("Enter the X and Y coordinate values: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }
}
