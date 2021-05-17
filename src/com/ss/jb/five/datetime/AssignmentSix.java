package com.ss.jb.five.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentSix {

    /**
     * Prints the date of every monday in the month of the current year
     * @param month
     */
    public void printMondays(int month) {
        LocalDate date = LocalDate.of(Year.now().getValue(), month, 1);

        date = date.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        do {
            System.out.println(date);
            date = date.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        } while (date.getMonth().getValue() == month);
    }

}
