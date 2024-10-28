package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemFixedPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        int password = scanner.nextInt();

        while (password != 2002) {
            System.out.print("Invalid password! Try again: ");
            password = scanner.nextInt();
        }

        System.out.println("Access allowed!");

        scanner.close();
    }
}
