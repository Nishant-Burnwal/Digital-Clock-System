package com.bridgelabz.qa.digitalclocksystem;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
        }
        if (minute == 60) {
            minute = 0;
            hour++;
        }
        if (hour == 24) {
            hour = 0;
        }
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            System.out.println("Time set successfully.");
        } else {
            System.out.println("Invalid time entered.");
        }
    }

    public void displayTime() {
        System.out.printf("Current Time: %02d:%02d:%02d\n", hour, minute, second);
    }
}
