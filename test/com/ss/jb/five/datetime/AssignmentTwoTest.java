package com.ss.jb.five.datetime;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentTwoTest {

    @Test
    public void prevThursdayTest() {
        AssignmentTwo assignment = new AssignmentTwo();

        LocalDate now = LocalDate.now();
        LocalDate thursday = assignment.getPrevThursday(now);

        TestCase.assertTrue(thursday.getDayOfWeek() == DayOfWeek.THURSDAY && thursday.toEpochDay() <= now.toEpochDay() && thursday.toEpochDay() > now.toEpochDay() - 7);
    }

}
