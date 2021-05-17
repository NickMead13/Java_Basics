package com.ss.week1;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentFiveTest {

    @Test
    public void groupSumTest() {
        AssignmentFive assignment = new AssignmentFive();

        TestCase.assertTrue(assignment.groupSumClump(0, new int[]{2, 4, 8}, 10));

        TestCase.assertTrue(assignment.groupSumClump(0, new int[]{1, 2, 4, 8 ,1}, 14));

        TestCase.assertFalse(assignment.groupSumClump(0, new int[]{2, 4, 4, 8}, 14));
    }

}
