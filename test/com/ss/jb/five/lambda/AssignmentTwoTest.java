package com.ss.jb.five.lambda;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentTwoTest {

    @Test
    public void separateNumsTest() {
        List<Integer> nums = Arrays.asList(3, 44);

        TestCase.assertEquals("o3,e44", AssignmentTwo.separateNums(nums));
    }

}
