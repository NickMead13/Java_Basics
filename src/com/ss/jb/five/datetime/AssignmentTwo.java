package com.ss.jb.five.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentTwo {

    /**
     * Returns the date of last Thursday
     * @param date
     * @return
     */
    public LocalDate getPrevThursday(LocalDate date) {
        return date.with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
    }

}
