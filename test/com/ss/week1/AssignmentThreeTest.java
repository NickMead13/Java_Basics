package com.ss.week1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentThreeTest {

    @Test
    public void rightDigitTest() {
        AssignmentThree assignment = new AssignmentThree();
        List<Integer> numList, results, expected;

        numList = Arrays.asList(1, 2, 3);
        results = assignment.doubling(numList);
        expected = Arrays.asList(2, 4, 6);

        assertEquals(results, expected);

        numList = Arrays.asList(6, 8, 6, 8, -1);
        results = assignment.doubling(numList);
        expected = Arrays.asList(12, 16, 12, 16, -2);

        assertEquals(results, expected);

        numList = Arrays.asList();
        results = assignment.doubling(numList);
        expected = Arrays.asList();

        assertEquals(results, expected);
    }

}
