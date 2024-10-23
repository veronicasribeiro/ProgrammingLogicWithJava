package com.example.conditional.structure;

/*
    Problem: 'Change Verified'
    Make a program to calculate the change in the process of paying for a
    product in a grocery store. The program must read the unit price of
    the product, the number of units purchased of this product, and the
    amount of money given by the customer. Your program must show the amount
    of change to be returned to the customer. If the money given by the
    customer is not enough, show a message informing the remaining amount
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemChangeVerified {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Unit price of the product: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Quantity purchased: ");
        int quantityPurchased = scanner.nextInt();
        System.out.print("Money received: ");
        double moneyReceived = scanner.nextDouble();


        if (moneyReceived > unitPrice * quantityPurchased) {
            double change = moneyReceived - unitPrice * quantityPurchased;
            String changeFormat = df.format(change);
            System.out.println("CHANGE = R$" + changeFormat);
        } else if (moneyReceived < unitPrice * quantityPurchased) {
            double lack = unitPrice * quantityPurchased - moneyReceived;
            System.out.println("NOT ENOUGH MONEY. MISSING R$" + lack);
        } else {
            System.out.println("No change");
        }

        scanner.close();

    }
}
