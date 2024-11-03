package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ChallengeAthletes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many athletes are there? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String name;
        String gender;
        int totalMen = 0;
        int totalWoman = 0;
        double totalHeightWomen = 0;
        int totalAthletes = 0;
        double height;
        double maxHeight = 0;
        String maxWeightAthleteName = "";
        double weight;
        double sumWeight = 0;
        int quantityWeight = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the data of athlete number " + i + ":");

            System.out.print("Name: ");
            name = scanner.nextLine();

            System.out.print("Gender (M/F): ");
            gender = scanner.next();

            while (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
                System.out.print("Invalid value! Please enter F or M: ");
                gender = scanner.next();
            }

            if (gender.equalsIgnoreCase("m")) {
                totalMen++;
            } else if (gender.equalsIgnoreCase("f")) {
                totalWoman++;
            }

            scanner.nextLine();

            System.out.print("Height: ");
            height = scanner.nextDouble();

            while (height <= 0) {
                System.out.print("Invalid value! Please enter a positive value: ");
                height = scanner.nextDouble();
            }

            if (gender.equalsIgnoreCase("f")) {
                totalHeightWomen = totalHeightWomen + height;
            }

            scanner.nextLine();

            if (height > maxHeight) {
                maxHeight = height;
                maxWeightAthleteName = name;
            }

            System.out.print("Weight: ");
            weight = scanner.nextDouble();

            while (weight <= 0) {
                System.out.print("Invalid value! Please enter a positive value: ");
                weight = scanner.nextDouble();
            }

            if (weight > 0) {
                sumWeight = sumWeight + weight;
                quantityWeight++;
            }

            scanner.nextLine();

            totalAthletes++;
        }

        double averageWeight = sumWeight / quantityWeight;
        String averageWeightFormat = df.format(averageWeight);

        double percentageMen = ((double) totalMen / totalAthletes) * 100;
        String percentageMenFormat = df.format(percentageMen);

        double averageHeightWoman = totalHeightWomen / totalWoman;
        String averageHeightWomanFormat = df.format(averageHeightWoman);

        System.out.println("\nREPORT: ");
        System.out.println("Average weight of athletes: " + averageWeightFormat);
        System.out.println("Tallest athlete: " + maxWeightAthleteName);
        System.out.println("Percentage of men: " + percentageMenFormat + "%");
        if (totalWoman == 0) {
            System.out.println("There are no registered women");
        } else {
            System.out.println("Average height of women: " + averageHeightWomanFormat);
        }

        scanner.close();
    }
}
