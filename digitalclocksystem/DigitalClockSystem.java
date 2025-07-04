package com.bridgelabz.qa.digitalclocksystem;

import java.util.Scanner;

/*
5. Digital Clock System
📘 Problem:
    Create a digital clock simulation.

Requirements:
    Class Clock with fields: hour, minute, second.
    Method tick() increases time by 1 second, handles rollover.
    Method displayTime() shows time in hh:mm:ss format.

OOP Concepts Used:
    Constructors
    Encapsulation
    Time logic using class fields

*/

public class DigitalClockSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Clock clock = new Clock(0, 0, 0); // Default time

        System.out.println("Welcome to the Digital Clock System");

        while (true) {
            System.out.println("\n Menu:");
            System.out.println("1. Set Time");
            System.out.println("2. Tick (+1 Second)");
            System.out.println("3. Show Time");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter hour (0-23): ");
                    int h = sc.nextInt();
                    System.out.print("Enter minute (0-59): ");
                    int m = sc.nextInt();
                    System.out.print("Enter second (0-59): ");
                    int s = sc.nextInt();
                    clock.setTime(h, m, s);
                    break;

                case 2:
                    clock.tick();
                    System.out.println("Clock ticked forward by 1 second.");
                    break;

                case 3:
                    clock.displayTime();
                    break;

                case 4:
                    System.out.println("Exiting Digital Clock. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
