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
        int older = 0;
        String olderPerson = "";

        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "st person's details:");
            System.out.print("Name: ");
            name[i] = scanner.nextLine();

            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            scanner.nextLine();

            if (age[i] > older) {
                older = age[i];
                olderPerson = name[i];
            }
        }

        System.out.println("OLDER PERSON: " + olderPerson);

        scanner.close();
    }
}
