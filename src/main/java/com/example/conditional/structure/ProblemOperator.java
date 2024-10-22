package com.example.conditional.structure;

/*
    Problem: 'Operator'
    A telephone operator charges R$50.00 for a basic plan thar entitles
    you to 100 minutes of phone use. Each minute that exceeds the 100
    minutes allowance costs R$2.00. Create a program to read the number
    of minutes a person has used and the show the amount to be paid
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.print("Enter the number of minutes: ");
        int numberOfMinutes = scanner.nextInt();

        double amountToPay;

        if (numberOfMinutes <= 100) {
            amountToPay = 50.00;
        } else {
            amountToPay = 50.00 + 2 * (numberOfMinutes - 100);
        }

        String amountToPayFormat = df.format(amountToPay);

        System.out.println("Amount to pay: R$" + amountToPayFormat);

        scanner.close();
    }
}
