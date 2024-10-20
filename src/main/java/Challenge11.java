/*
     Problem: 'Duration'
     Create a program to read a duration of time in seconds, then print this
     duration on the screen in the format hours:minutes:seconds
*/

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the duration in seconds: ");
        int durationSeconds = scanner.nextInt();

        int calculateHours = durationSeconds / 3600;
        int calculateMinutes = (durationSeconds % 3600) / 60;
        int calculateSeconds = durationSeconds % 60;

        System.out.println(calculateHours + ":" + calculateMinutes + ":" + calculateSeconds);

        scanner.close();
    }
}
