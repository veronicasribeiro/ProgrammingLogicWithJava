package com.example.Vectors;

import java.util.Scanner;

public class ProblemBelowAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = scanner.nextInt();

        double[] array = new double[n];
        int count = 0;
        double sumArray = 0;

        for (int i = 0; i < n ; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextDouble();
            sumArray = sumArray + array[i];
            count++;
        }

        double averageArray = sumArray / count;

        System.out.println("\nVECTOR AVERAGE " + averageArray);
        System.out.println("BELOW AVERAGE ELEMENTS: ");
        for (int i = 0; i < n ; i++) {
            if (array[i] < averageArray) {
                System.out.println(array[i]);
            }
        }

        scanner.close();
    }
}
