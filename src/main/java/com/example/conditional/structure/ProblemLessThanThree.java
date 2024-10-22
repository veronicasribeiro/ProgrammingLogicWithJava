package com.example.conditional.structure;

/*
    Problem: 'Less than three'
    Make a program to read three integers. The,. print which is the
    smallest of the three numbers read. In case of a tie, print only once.
*/

import java.util.Scanner;

public class ProblemLessThanThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First value: ");
        int firstValue = scanner.nextInt();
        System.out.print("Second value: ");
        int secondValue = scanner.nextInt();
        System.out.print("Third value: ");
        int thirdValue = scanner.nextInt();

        if ((firstValue < secondValue && firstValue < thirdValue) || firstValue == secondValue
                || firstValue == thirdValue) {
            System.out.println("MINOR = " + firstValue);
        } else if (secondValue < firstValue && secondValue < thirdValue) {
            System.out.println("MINOR = " + secondValue);
        } else {
            System.out.println("MINOR = " + thirdValue);
        }

        scanner.close();
    }
}
