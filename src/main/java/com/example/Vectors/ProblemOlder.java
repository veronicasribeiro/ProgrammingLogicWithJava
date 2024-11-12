package com.example.Vectors;

import java.util.Scanner;

public class ProblemOlder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many people are you going to type? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[n];
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "st person's details:");
            System.out.print("Name: ");
            name[i] = scanner.nextLine();

            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            scanner.nextLine();
        }

        int older = age[0];
        int positionOlder = 0;

        for (int i = 0; i < n; i++) {
            if (age[i] > older) {
                older = age[i];
                positionOlder = i;
            }
        }

        System.out.println("OLDER PERSON: " + name[positionOlder]);

        scanner.close();
    }
}
