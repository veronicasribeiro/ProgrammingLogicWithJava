package com.example.repetitive.structure;

import java.util.Scanner;

public class ProblemFuel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a code (1,2,3) or 4 to stop: ");
        int code = scanner.nextInt();

        int countOfAlcohol = 0;
        int countOfGasoline = 0;
        int countOfDiesel = 0;

        while (code != 4) {
            if (code == 1) {
                countOfAlcohol++;
            } else if (code == 2) {
                countOfGasoline++;
            } else if (code == 3) {
                countOfDiesel++;
            }
            System.out.print("Enter a code (1,2,3) or 4 to stop: ");
            code = scanner.nextInt();
        }

        System.out.println("THANK YOU VERY MUCH");
        System.out.println("Alcohol: " + countOfAlcohol);
        System.out.println("Gasoline: " + countOfGasoline);
        System.out.println("Diesel: " + countOfDiesel);

        scanner.close();
    }
}
