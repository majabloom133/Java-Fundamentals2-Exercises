package com.example;

import  java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeExercises {

    public static void main(String[] args) {

        // Exercise 1
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today); // 2026-03-04

        // Exercise 2
        DateTimeFormatter swedishFormatter =
                DateTimeFormatter.ofPattern("EEEE d MMMM", Locale.forLanguageTag("sv"));
        String formattedSwedish = today.format(swedishFormatter);

        System.out.println("Exercise 2 - formatted date: " + formattedSwedish);


        // Exercise 3

        // Find previous (or same) monday
        LocalDate lastMonday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        System.out.println("\nExercise 3 - previous monday: " + lastMonday);
        System.out.println("Week (mon-sun) in ISO-format: ");

        // Loop for 7 days and print every date, in ISO format
        for (int i = 0; i < 7; i++) {
            LocalDate day = lastMonday.plusDays(i);
            System.out.println(day);
        }

        // Exercise 4

    }
}
