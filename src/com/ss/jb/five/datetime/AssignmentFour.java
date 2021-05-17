package com.ss.jb.five.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentFour {

    ZoneId zoneId = ZoneId.systemDefault();

    /**
     * Converts an instant to a zoned date time, using the locally stored ZoneId
     * @param instant
     * @return
     */
    public ZonedDateTime toZonedDateTime(Instant instant) {
        return ZonedDateTime.ofInstant(instant, zoneId);
    }

    /**
     * Converts a zoned date time to an instant
     * @param dateTime
     * @return
     */
    public Instant toInstant(ZonedDateTime dateTime) {
        return dateTime.toInstant();
    }

}
