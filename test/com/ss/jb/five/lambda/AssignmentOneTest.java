package com.ss.jb.five.lambda;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentOneTest {

    private static final List<String> NAMES = Arrays.asList("Elijah", "William", "James", "Benjamin", "Olivia", "Emma");

    @Test
    public void sortTest() {
        AssignmentOne assignment = new AssignmentOne();

        TestCase.assertEquals("Emma", assignment.sortByLength(new ArrayList<>(NAMES)).get(0));
        TestCase.assertEquals("Benjamin", assignment.sortByLengthReverse(new ArrayList<>(NAMES)).get(0));
        TestCase.assertEquals("Benjamin", assignment.sortByFirstChar(new ArrayList<>(NAMES)).get(0));
        TestCase.assertEquals("Elijah", assignment.sortByE(new ArrayList<>(NAMES)).get(0));
        TestCase.assertEquals("Elijah", assignment.sortByEWithHelper(new ArrayList<>(NAMES)).get(0));
    }

}
