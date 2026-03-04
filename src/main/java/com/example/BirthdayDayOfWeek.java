package com.example;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class BirthdayDayOfWeek {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1995, 10, 25);

        DayOfWeek day =  birthday.getDayOfWeek();

        System.out.println("My birthday: (" + birthday + ") was on a " + day);


    }
}
