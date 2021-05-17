package com.ss.jb.five.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentTwo {

    /**
     * Converts the list into a stream, then maps the values to strings preceded by
     * 'e' or 'o' (even or odd, respectively), and joins them with a comma separating them,
     * returning the formatted string
     * @param nums
     * @return
     */
    public static String separateNums(List<Integer> nums) {
        return nums.stream().map(i -> (i % 2 == 0 ? 'e' : 'o') + i.toString()).collect(Collectors.joining(","));
    }

}
