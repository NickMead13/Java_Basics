package com.ss.jb.five.datetime;

import java.time.Month;
import java.time.Year;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentFive {

    /**
     * Prints the length of each month in the given year
     * @param year
     */
    public void printMonthLengths(int year) {
        boolean leapYear = Year.of(year).isLeap();
        System.out.println("Month lengths of year " + year + ":\n");
        for (Month month : Month.values()) {
            System.out.println(month.name() + ": " + month.length(leapYear));
        }
    }

}
