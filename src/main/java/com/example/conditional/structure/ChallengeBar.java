package com.example.conditional.structure;

/*
    Challenge: 'Bar'
    At a bar, the entrance fee is 10 reais for men and 8 reais for woman; Each
    beer costs 5 reais, each soda costs 3 reais, and each skewer costs 7 reais.
    Additionally, the bar charges a cover fee of 4 reais. However, if the total
    amount spent on consumption exceeds 30 reais, the cover fee is waived. Write
    a program to read the following data for a bar customer: gender (F or M),
    number of beers, sodas, and skewers consumed. The program should then
    display a report with the total bill to be paid by the customer
    */

import java.util.Scanner;

public class ChallengeBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Number of beers: ");
        int numberBeers = scanner.nextInt();
        System.out.print("Number of sodas: ");
        int numberSodas = scanner.nextInt();
        System.out.print("Number of skewers: ");
        int numberSkewers = scanner.nextInt();

        System.out.println();

        double entrance = 0;

        if (gender.equalsIgnoreCase("F")) {
            entrance = 8;
        } else if (gender.equalsIgnoreCase("M")) {
            entrance = 10;
        }

        double consumption = numberBeers * 5 + numberSodas * 3 + numberSkewers * 7;

        System.out.println("REPORT:");
        System.out.println("Consumption = R$" + consumption);

        double couvert = 0;

        if (consumption > 30) {
            System.out.println("Exemption from couvert");
        } else {
            couvert = 4;
            System.out.println("Couvert = R$" + couvert);
        }

        System.out.println("Entrance = R$" + entrance);

        System.out.println();

        double amountToPay = entrance + consumption + couvert;

        System.out.println("Amount to pay = R$" + amountToPay);

        scanner.close();
    }
}
