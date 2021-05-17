package com.ss.jb.five.datetime;

import junit.framework.TestCase;
import org.junit.Test;

import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentFourTest {

    @Test
    public void convertTest() {
        AssignmentFour assignment = new AssignmentFour();

        Instant instant = Instant.now();
        TestCase.assertEquals(instant, assignment.toInstant(assignment.toZonedDateTime(instant)));

        ZonedDateTime dateTime = ZonedDateTime.now();
        TestCase.assertEquals(dateTime, assignment.toZonedDateTime(assignment.toInstant(dateTime)));
    }

}
