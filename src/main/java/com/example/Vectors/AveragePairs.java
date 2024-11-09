package com.example.Vectors;

import java.util.Scanner;

public class AveragePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many elements will the vector have? ");
        int n = scanner.nextInt();

        int[] array = new  int[n];
        int count = 0;
        int addPairs = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter a number: ");
            array[i] = scanner.nextInt();
            if (array[i] % 2 == 0) {
                addPairs = addPairs + array[i];
                count++;
            }
        }

        double peerAverage = (double) addPairs / count;

        if (peerAverage > 0) {
            System.out.println("PEER AVERAGE = " + peerAverage);
        } else {
            System.out.println("NO EVEN NUMBER");
        }

        scanner.close();
    }
}
