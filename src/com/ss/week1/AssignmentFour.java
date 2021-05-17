package com.ss.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentFour {

    public AssignmentFour() {

    }

    /**
     * Provide a list of strings, returning the same list of strings but with any 'x' characters removed
     * @param list
     * @return
     */
    public List<String> noX(List<String> list) {
        List<String> results = new ArrayList<>();
        for (String s : list) {
            results.add(s.replaceAll("x", "").replaceAll("X", ""));
        }
        return results;

        // Alternative using stream
        //return list.stream().map(s -> s.replaceAll("x", "").replaceAll("X", "")).collect(Collectors.toList());
    }

}
