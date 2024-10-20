package com.example.sequential.structure;

/*
    Problem: 'Measurements'
    Make a program to read three measurements A, B and C. Then calculate and
    display (print the data with four decimal places):
    a) the area of the square with side A
    b) the area of the right triangle with base A and height B
    c) the area of the trapezoid with bases A and B, and height C
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        System.out.print("Enter measurement A: ");
        double measurementA = scanner.nextDouble();
        System.out.print("Enter measurement B: ");
        double measurementB = scanner.nextDouble();
        System.out.print("Enter measurement C: ");
        double measurementC = scanner.nextDouble();

        double areaSquare = Math.pow(measurementA,2);
        double areaTriangle = (measurementA * measurementB) / 2;
        double areaTrapezoid = (measurementA + measurementB) * measurementC / 2;

        String areaSquareFormat = df.format(areaSquare);
        String areaTriangleFormat = df.format(areaTriangle);
        String areaTrapezoidFormat = df.format(areaTrapezoid);

        System.out.println("AREA OF THE SQUARE: " + areaSquareFormat);
        System.out.println("AREA OF THE TRIANGLE: " + areaTriangleFormat);
        System.out.println("AREA OF THE TRAPEZOID: " + areaTrapezoidFormat);

        scanner.close();
    }
}
