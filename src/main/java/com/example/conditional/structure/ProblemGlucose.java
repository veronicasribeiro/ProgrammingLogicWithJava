package com.example.conditional.structure;

/*
    Problem: 'Glucose'
    Create a program to read the amount of glucose in a person's blood and
    then display on the screen  the classification of this glucose according
    to the reference table
*/

import java.util.Scanner;

public class ProblemGlucose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the glucose measurement: ");
        double glucoseMeasurement = scanner.nextDouble();

        if (glucoseMeasurement <= 100) {
            System.out.println("Classification: Normal");
        } else if (glucoseMeasurement > 100 && glucoseMeasurement <= 140) {
            System.out.println("Classification: High");
        } else {
            System.out.println("Classification: Diabetes");
        }

        scanner.close();
    }
}
