package com.example.Vectors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Merchant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("How many products' data will be entered? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        double[] purchasePrice = new double[n];
        double[] sellingPrice = new double[n];

        double profitTotal = 0, totalSales = 0, totalPurchase = 0;
        int totalProductsBelow10 = 0, totalProductsBetween10And20 = 0, profitAbove20 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Product " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Purchase price: ");
            purchasePrice[i] = scanner.nextDouble();

            System.out.print("Selling price: ");
            sellingPrice[i] = scanner.nextDouble();

            scanner.nextLine();

            double profit = sellingPrice[i] - purchasePrice[i];
            double profitPercentage = (profit / purchasePrice[i]) * 100;

            profitTotal = profitTotal + profit;
            totalPurchase = totalPurchase + purchasePrice[i];
            totalSales = totalSales + sellingPrice[i];

            if (profitPercentage < 10) {
                totalProductsBelow10++;
            } else if (profitPercentage >= 10 && profitPercentage <= 20) {
                totalProductsBetween10And20++;
            } else {
                profitAbove20++;
            }
        }

        String totalPurchaseFormat = df.format(totalPurchase);
        String totalSalesFormat = df.format(totalSales);
        String profitTotalFormat = df.format(profitTotal);

        System.out.println("\nREPORT: ");
        System.out.println("Profit below 10%: " + totalProductsBelow10);
        System.out.println("Profit between 10% and 20%: " + totalProductsBetween10And20);
        System.out.println("Profit above 20%: " + profitAbove20);
        System.out.println("Total purchase value: " + totalPurchaseFormat);
        System.out.println("Total sales value: " + totalSalesFormat);
        System.out.println("Total profit: " + profitTotalFormat);

        scanner.close();
    }
}
