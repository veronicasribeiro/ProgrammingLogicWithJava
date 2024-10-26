package com.example.repetitive.structure;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ProblemMiddleAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Enter ages: ");
        int age = scanner.nextInt();

        int sumOfAges = 0;
        int countOfAge = 0;

        if (age < 0) {
            System.out.println("IMPOSSIBLE TO CALCULATE");
        } else {
            while (age > 0) {
                sumOfAges = sumOfAges + age;
                countOfAge++;
                age = scanner.nextInt();
            }
            double average = (double) sumOfAges / countOfAge;
            String averageFormat = df.format(average);
            System.out.println("AVERAGE = " + averageFormat);
        }

        scanner.close();
    }
}
