package com.example.sequential.structure;

/*
    Problem: 'Payment'
    Create a program to read an employee's name, the amount they receive per
    hour, and the number of hours they worked. At the end, display the
    employee's payment amount with an explanatory message
*/


import java.util.Scanner;

public class Challenge08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Hourly rate: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Hours worked: ");
        int hoursWorked = scanner.nextInt();

        double payment = hourlyRate * hoursWorked;

        System.out.println("Payment to " + name + " must be " + payment);

        scanner.close();
    }
}
