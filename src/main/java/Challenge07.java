/*
    Problem: 'Circle'
    Make a program to read the value "r" of the radius of a circle, and then
    display the value of the area of the circle with three decimal places.
    The formula for tge area of the circle is as follows: area = 𝜋. 𝑟2. You can
    use the value of 𝜋 provided by the library of tour programming language,
    pr, if you prefer, use the value 3.14159 directly
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Challenge07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.000");

        System.out.print("Enter the value of the circle radius: ");
        double circleRadius = scanner.nextDouble();

        double area = Math.PI * Math.pow(circleRadius, 2);

        String areaFormat = df.format(area);

        System.out.println("AREA = " + areaFormat);

        scanner.close();
    }
}
