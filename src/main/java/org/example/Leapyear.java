package org.example;

public class Leapyear {

    public static boolean IsLeapyear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}


