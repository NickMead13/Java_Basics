package com.ss.week1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentTwoTest {

    @Test
    public void rightDigitTest() {
        AssignmentTwo assignment = new AssignmentTwo();
        List<Integer> numList, results, expected;

        numList = Arrays.asList(1, 22, 93);
        results = assignment.rightDigit(numList);
        expected = Arrays.asList(1, 2, 3);

        assertEquals(results, expected);

        numList = Arrays.asList(16, 8, 886, 8, 1);
        results = assignment.rightDigit(numList);
        expected = Arrays.asList(6, 8, 6, 8, 1);

        assertEquals(results, expected);

        numList = Arrays.asList(10, 0);
        results = assignment.rightDigit(numList);
        expected = Arrays.asList(0, 0);

        assertEquals(results, expected);
    }

}
