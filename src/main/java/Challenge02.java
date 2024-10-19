/*
    Problem: "Land"
    Make a program to read the width and length measurements of a rectangular
    plot of land with one decimal place, as well as the value of the square
    meter of the land with two decimal places. Then, the program must show the
    value of the area of the land, as weel as the value of the price of the land,
    both with two decimal places.
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        System.out.println("Enter the width of the land: ");
        double landWidth = scanner.nextDouble();

        System.out.println("Enter the length of the land: ");
        double landLength = scanner.nextDouble();

        System.out.println("Enter the value per square meter: ");
        double valuePerSquareMeter = scanner.nextDouble();

        double landArea = landWidth * landLength; // area calculation
        double landPrice = valuePerSquareMeter * landArea; // land value calculation

        String landAreaFormat = df.format(landArea);
        String landPriceFormat = df.format(landPrice);

        System.out.println("Land area = " + landAreaFormat);
        System.out.println("Land price = " + landPriceFormat);
    }
}
