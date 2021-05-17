package com.ss.week1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentTwo {

    /**
     * Returns a list of the rightmost digit from a list of numbers
     * @param numList
     * @return
     */
    public List<Integer> rightDigit(List<Integer> numList) {
        return numList.stream()
                .map(i -> i % 10)
                .collect(Collectors.toList());
    }

}
