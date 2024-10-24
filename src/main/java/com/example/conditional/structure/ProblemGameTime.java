package com.example.conditional.structure;

/*
    Problem: 'Game Time'
    Read the start time and end time of a game. Then calculate the duration
    of the game, knowing that it csn start on one day and end on another,
    having a minimum duration of 1 hour and a maximum of 24 hours
*/

import java.util.Scanner;

public class ProblemGameTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Start time: ");
        int startTime = scanner.nextInt();
        System.out.print("End time: ");
        int endTime = scanner.nextInt();

        int time;

        if (endTime >= startTime) {
            time = endTime - startTime;
        } else {
            time = (24 - startTime) + endTime;
        }

        System.out.println("The game lasted " + time + " hours");
    }
}
