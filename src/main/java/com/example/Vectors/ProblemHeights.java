package com.example.Vectors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many people will be typed? ");
        int n = scanner.nextInt();

        scanner.nextLine();

        String name;
        int age;
        double heights;
        int count = 0;
        double sumHeights = 0;
        String[] peopleUnder16 = new String[n];
        int countUnder16 = 0;
        int totalUnder16 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "st person's details:");
            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.print("Age: ");
            age = scanner.nextInt();

            if (age < 16) {
                peopleUnder16[countUnder16] = name;
                countUnder16++;
                totalUnder16++;
            }

            System.out.print("Heights: ");
            heights = scanner.nextDouble();

            sumHeights = sumHeights + heights;
            count++;

            scanner.nextLine();
        }

        double averageHeights = sumHeights / count;
        String averageHeightsFormat = df.format(averageHeights);

        double percentageUnder16 = ((double) totalUnder16 / count) * 100;

        System.out.println("\nAverage height: " + averageHeightsFormat);
        System.out.println("Persons under 16 years of age: " + percentageUnder16 + "%");

        for (int i = 0; i < countUnder16; i++) {
            System.out.println(peopleUnder16[i]);
        }


        scanner.close();
    }
}
