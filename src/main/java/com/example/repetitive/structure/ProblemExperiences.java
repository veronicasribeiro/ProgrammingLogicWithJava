package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemExperiences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many test cases will be typed? ");
        int n = scanner.nextInt();

        int quantityOfGuineaPigs;
        String typeOfGuineaPig;
        int totalOfGuineaPigs = 0;
        int totalRabbits = 0;
        int totalRats = 0;
        int totalFrogs = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Number of guinea pigs: ");
            quantityOfGuineaPigs = scanner.nextInt();

            System.out.print("Type of guinea pig: ");
            typeOfGuineaPig = scanner.next();

            totalOfGuineaPigs = totalOfGuineaPigs + quantityOfGuineaPigs;

            if (typeOfGuineaPig.equalsIgnoreCase("c")) {
                totalRabbits = totalRabbits + quantityOfGuineaPigs;
            } else if (typeOfGuineaPig.equalsIgnoreCase("r")) {
                totalRats = totalRats + quantityOfGuineaPigs;
            }else if (typeOfGuineaPig.equalsIgnoreCase("s")) {
                totalFrogs = totalFrogs + quantityOfGuineaPigs;
            }
        }

        int totalExperiences = totalRabbits + totalRats + totalFrogs;
        double percentageRabbits = ((double) totalRabbits / totalExperiences) * 100;
        double percentageRats = ((double) totalRats / totalExperiences) * 100;
        double percentageFrogs = ((double) totalFrogs / totalExperiences) * 100;

        String percentageRabbitsFormat = df.format(percentageRabbits);
        String percentageRatsFormat = df.format(percentageRats);
        String percentageFrogsFormat = df.format(percentageFrogs);

        System.out.println("\nFINAL REPORT: ");
        System.out.println("Total: " + totalOfGuineaPigs + " guinea pigs");
        System.out.println("Total rabbits: " + totalRabbits);
        System.out.println("Total rats: " + totalRats);
        System.out.println("Total frogs: " + totalFrogs);
        System.out.println("Percentage of rabbits: " + percentageRabbitsFormat);
        System.out.println("Percentage of rats: " + percentageRatsFormat);
        System.out.println("Percentage of frogs: " + percentageFrogsFormat);

        scanner.close();
    }
}
