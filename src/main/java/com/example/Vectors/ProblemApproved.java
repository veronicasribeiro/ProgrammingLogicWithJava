package com.example.Vectors;

import java.util.Scanner;

public class ProblemApproved {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students will be typed? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] name = new String[n];
        double[] averages = new double[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, first and second grade of the " + (i + 1) + "st student: ");
            name[i] = scanner.nextLine();

            double note1 = scanner.nextDouble();
            double note2 = scanner.nextDouble();
            scanner.nextLine();

            averages[i] = (note1 + note2) / 2;

        }

        System.out.println("Approved students:");

        for (int i = 0; i < n; i++) {
            if (averages[i] >= 6) {
                System.out.println(name[i]);
            }
        }

        scanner.close();
    }
}
