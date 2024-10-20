package com.example.sequential.structure;

/*
    Problem: 'Consumption'
    Make a program to read the total distance (in km) traveled by a car, as
    well as the total fuel consumed by this car when traveling this distance.
    Your program should show the average consumption of the car, with three
    decimal places
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        System.out.print("Distance traveled: ");
        double distanceTraveled = scanner.nextDouble();
        System.out.print("Fuel spent: ");
        double fuelSpent = scanner.nextDouble();

        double averageConsumption = distanceTraveled / fuelSpent;

        String averageConsumptionFormat = df.format(averageConsumption);

        System.out.println("Average consumption = " + averageConsumptionFormat);

        scanner.close();
    }
}
