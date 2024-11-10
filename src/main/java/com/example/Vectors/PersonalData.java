package com.example.Vectors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many people will be typed? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        double[] heightArray = new double[n];
        double averageHeightWomen = 0;
        double sumHeightWomen = 0;
        int count = 0;

        double smallestHeight = Double.MAX_VALUE;
        double greaterHeight = Double.MIN_VALUE;

        String gender;
        int numberOfMen = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Height of " + (i + 1) + "st person: ");
            heightArray[i] = scanner.nextDouble();

            scanner.nextLine();

            System.out.print((i + 1) + "nd person gender: ");
            gender = scanner.nextLine();

            if (gender.equalsIgnoreCase("f")) {
                sumHeightWomen = sumHeightWomen + heightArray[i];
                count++;
                averageHeightWomen = sumHeightWomen / count;
            }

            if (heightArray[i] < smallestHeight) {
                smallestHeight = heightArray[i];
            }

            if (heightArray[i] > greaterHeight) {
                greaterHeight = heightArray[i];
            }

            if (gender.equalsIgnoreCase("m")) {
                numberOfMen++;
            }
        }


        String averageHeightWomenFormat = df.format(averageHeightWomen);

        System.out.println("Smallest height = " + smallestHeight);
        System.out.println("Greatest height = " + greaterHeight);
        System.out.println("Average height of women = " + averageHeightWomenFormat);
        System.out.println("Number of men = " + numberOfMen);

        scanner.close();
    }
}
