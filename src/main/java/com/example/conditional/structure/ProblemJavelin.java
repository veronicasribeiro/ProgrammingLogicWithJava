package com.example.conditional.structure;

/*
    Problem: 'Javelin'
    In javelin throwing, the athlete has three chances to throw the javelin
    as far as possible. You must create a program to, given the measurements
    of the three throwing attempts, inform which was the longest
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemJavelin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Enter the three distances: ");
        double distance1 = scanner.nextDouble();
        double distance2 = scanner.nextDouble();
        double distance3 = scanner.nextDouble();

        if (distance1 > distance2 && distance1 > distance3) {
            String distance1Format = df.format(distance1);
            System.out.println("GREATEST DISTANCE = " + distance1Format);
        } else if (distance2 > distance1 && distance2 > distance3) {
            String distance2Format = df.format(distance2);
            System.out.println("GREATEST DISTANCE = " + distance2Format);
        } else {
            String distance3Format = df.format(distance3);
            System.out.println("GREATEST DISTANCE = " + distance3Format);
        }

        scanner.close();
    }
}
