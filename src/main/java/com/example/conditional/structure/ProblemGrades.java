package com.example.conditional.structure;

/*
    Problem: 'Grades'
    Create a program to read the two grades that a student obtained in the
    first and second semesters of an annual course. Then, display the final
    grade that the student obtained (with one decimal place) iin the year
    along with an explanatory text. If the student's final grade is less than
    60.00, display the message "FAILED".
*/

import java.util.Scanner;

public class ProblemGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first grade: ");
        double firstGrade = scanner.nextDouble();
        System.out.print("Enter the second grade: ");
        double secondGrade = scanner.nextDouble();

        double finalGrade = firstGrade + secondGrade;

        if (finalGrade < 60.00) {
            System.out.println("FINAL GRADE = " + finalGrade);
            System.out.println("FAILED");
        } else {
            System.out.println("FINAL GRADE = " + finalGrade);
        }

        scanner.close();

    }
}
