package com.ss.jb.five.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentSeven {

    /**
     * Checks whether or not a given date (year, month, dayOfMonth) occur on a Friday the 13th
     * @param year
     * @param month
     * @param dayOfMonth
     * @return
     */
    public boolean isUnlucky(int year, int month, int dayOfMonth) {
        LocalDate date = LocalDate.of(year, month, dayOfMonth);
        return (date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13);
    }

}
