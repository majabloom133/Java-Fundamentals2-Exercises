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

        // Exercise 9
        LocalTime now = LocalTime.now();

        // Exercise 10
        int nano = now.getNano();
        System.out.println("Exercise 10 - Nano seconds: " + nano);

        // Exercise 11
        LocalTime parsedTime = LocalTime.parse("10:32:53");

        // Exercise 12
        DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm:ss");
        // Add string
        String formattedTime = now.format(timeFmt);
        // Print formatted time
        System.out.println("Exercise 12 - Formatted Current Time: " + formattedTime);

        // Exercise 13
        LocalDateTime specificDT = LocalDateTime.of(2018,4, 5, 10, 0);
        System.out.println("Exercise 13 - Specific LocalDateTime: " + specificDT);


        // Exercise 14
        DateTimeFormatter swedishLongFmt = DateTimeFormatter.ofPattern("eeee d MMMM HH:mm", Locale.forLanguageTag("sv"));
String formattedDT = specificDT.format(swedishLongFmt);
System.out.println("Exercise 14 - Formatted: " + formattedDT);


        // Exercise 15
        // Create Date, Create Time
        LocalDate myDate = LocalDate.of(2026, 12, 24);
        LocalTime myTime = LocalTime.of(15, 0);
        // Combine to LocalDateTime object
        LocalDateTime combinedDT = LocalDateTime.of(myDate,myTime);
        //Print comnined date and time
        System.out.println("Exercise 15 - Combined Date and Time: " + combinedDT);

        // Exercise 16
        // Create LocalDateTime object
        LocalDateTime currentFull = LocalDateTime.now();
        //Extract LocalTime and LocalDate to their own variables
        LocalDate justTheDate = currentFull.toLocalDate();
        LocalTime justTheTime = currentFull.toLocalTime();
        // Print the separated objects
        System.out.println("\nExercise 16 - Extracted Components: ");
        System.out.println("Date object: " + justTheDate);
        System.out.println("Time object: " + justTheTime);




    }
}
