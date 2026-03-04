package com.example;

import  java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class DateTimeExercises {

    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Argument passed; " + args[0]);
        }

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

        String isoString = "2026-03-04";
        LocalDate parsedDate = LocalDate.parse(isoString);
        System.out.println("\nExercise4 - Parsed Date: " + parsedDate);

        // Exercise 5

        // Exercise 6
        System.out.println("\nExercise 6 - Future and Past Date");

        // Get today's date
        // Plus 10 years, minus 10 months
        LocalDate futurePast = today
                .plusYears(10)
                .minusMonths(10);

        System.out.println("After +10 years -10 months: " + futurePast);

        // Extract month
        Month month = futurePast.getMonth();
        System.out.println("Month (enum): " + month);
        System.out.println("Month (name): " + month.name());


        // Exercise 7
        LocalDate birthDate = LocalDate.of(1995, 10, 25);

        // To get years/months/days you need Period.betweeb
        java.time.Period diff = java.time.Period.between(birthDate, futurePast);

        System.out.println(diff.getYears() + " years, " + diff.getMonths() + " months");

        // Exercise 8

        LocalDate currentDate = LocalDate.now();
        LocalDate result8 = today.plusYears(4).plusMonths(7).plusDays(29);
        System.out.println("Exercise 8: " + result8);


    }
}
