package com.example.conditional.structure;

/*
    Problem: 'Multiples'
    Make a program to read two integers, and tell if one number is a multiple
    of the other. The numbers can be entered in any order
*/

import java.util.Scanner;

public class ProblemMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two integers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if (number1 % number2 == 0) {
            System.out.println("Are multiple");
        } else {
            System.out.println("Are not multiple");
        }

        scanner.close();
    }
}
