package com.ss.jb.four;

import org.junit.Test;

import static junit.framework.TestCase.*;

/**
 * @author NickM13
 * @since 5/13/2021
 */
public class LineTest {

    @Test
    public void slopeTest() {
        Line l1 = new Line(0, 0, 5, 5);
        assertEquals(1, l1.getSlope(), 0.0001);
    }

    @Test
    public void distanceTest() {
        Line l1 = new Line(0, 0, 5, 5);
        assertEquals(Math.sqrt(5*5 + 5*5), l1.getDistance(), 0.0001);
    }

    @Test
    public void parallelTo() {
        Line l1 = new Line(0, 0, 5, 5);
        Line l2 = new Line(0, 1, 5, 6);
        assertTrue(l1.parallelTo(l2));

        l2 = new Line(0, 2, 5, 5);
        assertFalse(l1.parallelTo(l2));
    }

}
