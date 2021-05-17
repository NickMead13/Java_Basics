package com.ss.jb.five.datetime;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author NickM13
 * @since 5/16/2021
 */
public class AssignmentSevenTest {

    @Test
    public void unluckyTest() {
        AssignmentSeven assignment = new AssignmentSeven();

        TestCase.assertTrue(assignment.isUnlucky(2020, 11, 13));
        TestCase.assertFalse(assignment.isUnlucky(2021, 5, 16));
    }

}
