/*
     Problem: 'Ages'
     Make a program to read the name and age of two people. At the end, display
     a message with the names and the average age between these people, with one
     decimal place

*/

import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First person data: ");
        System.out.print("Name: ");
        String nameFirstPerson = scanner.nextLine();
        System.out.print("Age: ");
        int ageFirstPerson = scanner.nextInt();

        scanner.nextLine(); // Consume the line break left by nextInt()

        System.out.println("Second person data: ");
        System.out.print("Name: ");
        String nameSecondPerson = scanner.nextLine();
        System.out.print("Age: ");
        int ageSecondPerson = scanner.nextInt();

        double averageAge = (ageFirstPerson + ageSecondPerson) / 2.0;
        // I used 2.0 to ensure that the division is in floating point

        System.out.println("The average age of " + nameFirstPerson + " and " + nameSecondPerson + " is " + averageAge +
                " years old");

        scanner.close(); // It is good practice to clese the scanner
    }
}
