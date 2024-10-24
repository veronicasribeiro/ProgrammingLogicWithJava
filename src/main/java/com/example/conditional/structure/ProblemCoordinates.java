package com.example.conditional.structure;

/*
    Problem: 'Coordinates'
    Read the values of the X and Y coordinates of a point on the Cartesian
    plane. The determine which quadrant the point belongs to (Q1,Q2,Q3 o Q4).
    If the point is at the origin. write the message "Origen". If the point
    is on one of the axes, write "X Axis" ou "Y Axis", depending on the
    situation
*/

import java.util.Scanner;

public class ProblemCoordinates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Value of X: ");
        double x = scanner.nextDouble();
        System.out.print("Value of Y: ");
        double y = scanner.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x == 0 && y != 0) {
            System.out.println("Y Axis");
        } else if (x != 0) {
            System.out.println("X Axis");
        } else {
            System.out.println("Origen");
        }

        scanner.close();
    }
}
