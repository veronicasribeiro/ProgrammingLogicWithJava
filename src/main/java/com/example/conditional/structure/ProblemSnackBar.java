package com.example.conditional.structure;

/*
    Problem: 'Snack bar'
    A snack bar has several products. Each product has a code and a price.
    You must write a program to read the code and the quantity of a product
    purchased (assume a valid code), and then inform the amount to be paid,
    with two decimal places, according to the product table.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemSnackBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Purchased product code: ");
        int productCode = scanner.nextInt();
        System.out.print("Quantity purchased: ");
        int quantityPurchased = scanner.nextInt();

        double priceProduct = 0;

        if (productCode == 1) {
            priceProduct = 5 * quantityPurchased;
        } else if (productCode == 2) {
            priceProduct = 3.5 * quantityPurchased;
        }else if (productCode == 3) {
            priceProduct = 4.8 * quantityPurchased;
        }else if (productCode == 4) {
            priceProduct = 8.9 * quantityPurchased;
        }else if (productCode == 5) {
            priceProduct = 7.32 * quantityPurchased;
        }

        String priceProductFormat = df.format(priceProduct);

        System.out.println("Amount to pay R$" + priceProductFormat);

        scanner.close();

    }
}
