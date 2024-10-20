package com.example.sequential.structure;

/*
     Problem: 'Change'
     Make a program to calculate change during the payment process of a product
     in a grocery store. Thw program must read the unit price of the product,
     the quantity of units purchased, and the amount of money given by the
     customer (assume there is enough money). Your program should display the
     amount of change to be returned to the customer.
*/

import java.util.Scanner;

public class Challenge06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unit price of the product: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Quantity purchased: ");
        int quantityPurchased = scanner.nextInt();
        System.out.print("Money received: ");
        double moneyReceived = scanner.nextDouble();

        double change = moneyReceived - (productPrice * quantityPurchased);

        System.out.println("CHANGE = " + change);

        scanner.close();
    }
}
