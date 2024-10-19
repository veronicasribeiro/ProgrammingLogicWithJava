/*
    Problem: 'Sum'
    Make a program to read two integer values X and Y, and then display on
    the screen the value of the sum of these numbers
*/

import java.util.Scanner;

public class Challenge05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of X: ");
        int valueX = scanner.nextInt();
        System.out.print("Enter the value of Y: ");
        int valueY = scanner.nextInt();

        int sum = valueX + valueY;

        System.out.println("SUM = " + sum);

        scanner.close();

    }
}
