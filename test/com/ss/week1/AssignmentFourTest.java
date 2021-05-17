package com.ss.week1;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentFourTest {

    @Test
    public void noXTest() {
        AssignmentFour assignment = new AssignmentFour();
        List<String> original, results, expected;

        original = Arrays.asList("ax", "bb", "cx");
        results = assignment.noX(original);
        expected = Arrays.asList("a", "bb", "c");
        TestCase.assertEquals(results, expected);

        original = Arrays.asList("xxax", "xbxbx", "xxcx");
        results = assignment.noX(original);
        expected = Arrays.asList("a", "bb", "c");
        TestCase.assertEquals(results, expected);

        original = Arrays.asList("x");
        results = assignment.noX(original);
        expected = Arrays.asList("");
        TestCase.assertEquals(results, expected);
    }

}
