/*
    Problem: 'Rectangle'
    Make a program to read the measurements of the base and heigth of a
    rectangle. Then show the value of the area, perimeter and diagonal
    of this rectangle, with four dicimal places.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.0000");

        System.out.println("Base of the rectangle: ");
        double baseRectangle = scanner.nextDouble();
        System.out.println("Heigth of rectangle: ");
        double heigthRectangle = scanner.nextDouble();

        double areaRectangle = baseRectangle * heigthRectangle;
        double perimeterRectangle = 2 * (baseRectangle + heigthRectangle);
        double diagonalRectangle = Math.sqrt(Math.pow(baseRectangle, 2) + Math.pow(heigthRectangle, 2));

        String areaRectangleFormat = df.format(areaRectangle);
        String perimeterRectangleFormat = df.format(perimeterRectangle);
        String diagonalRectangleFormat = df.format(diagonalRectangle);

        System.out.println("AREA = " + areaRectangleFormat);
        System.out.println("PERIMETER = " + perimeterRectangleFormat);
        System.out.println("DIAGONAL = " + diagonalRectangleFormat);

    }
}
