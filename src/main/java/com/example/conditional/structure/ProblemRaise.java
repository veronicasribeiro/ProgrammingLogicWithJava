package com.example.conditional.structure;

/*
    Problem: 'Raise'
    A company will grant a percentage increase in salary to its employees
    depending on how much each person earns, according to the table. Write
    a program to read a person's salary, then show what this person's new
    salary is after the raise, how much the raise was, and what the percentage
    of the raise was
*/

import java.util.Scanner;

public class ProblemRaise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the person's salary: ");
        double personSalary = scanner.nextDouble();

        double increase;
        double newSalary;
        String percentage ;

        if (personSalary <= 1000) {
            increase = personSalary * 0.2;
            newSalary = increase + personSalary;
            percentage = "20%";
        } else if (personSalary > 1000 && personSalary <= 3000) {
            increase = personSalary * 0.15;
            newSalary = increase + personSalary;
            percentage = "15%";
        }else if (personSalary > 3000 && personSalary <= 8000) {
            increase = personSalary * 0.1;
            newSalary = increase + personSalary;
            percentage = "10%";
        } else {
            increase = personSalary * 0.05;
            newSalary = increase + personSalary;
            percentage = "5%";
        }

        System.out.println("Nem salary = R$" + newSalary);
        System.out.println("Increase = R$" + increase);
        System.out.println("Percentage = " + percentage);

        scanner.close();
    }
}
