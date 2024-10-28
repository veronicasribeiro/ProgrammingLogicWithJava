package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemNoteValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first note: ");
        double firstNote = scanner.nextDouble();

        while (firstNote < 0 || firstNote > 10) {
            System.out.print("Invalid value! Try again: ");
            firstNote = scanner.nextDouble();
        }

        System.out.print("Enter second note: ");
        double secondNote = scanner.nextDouble();

        while (secondNote < 0 || secondNote > 10) {
            System.out.print("Invalid value! Try again: ");
            secondNote = scanner.nextDouble();
        }

        double average = (firstNote + secondNote) / 2;

        System.out.println("AVERAGE = " + average);

        scanner.close();

    }
}
