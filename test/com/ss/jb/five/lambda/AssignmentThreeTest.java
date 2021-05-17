package com.ss.jb.five.lambda;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.*;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentThreeTest {

    @Test
    public void searchTest() {
        List<String> list = Arrays.asList("ape", "monkey", "apple", "age", "red");
        List<String> results = AssignmentThree.searchByStartAndLen(list, 'a', 3);
        List<String> expected = Arrays.asList("ape", "age");

        TestCase.assertEquals(results, expected);
    }

}
