package com.ss.week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentThree {

    /**
     * Returns a the passed list of numbers with all values multiplied by 2
     * @param numList
     * @return
     */
    public List<Integer> doubling(List<Integer> numList) {
        List<Integer> doubled = new ArrayList<>();
        for (int i : numList) {
            doubled.add(i * 2);
        }
        return doubled;
    }

}
