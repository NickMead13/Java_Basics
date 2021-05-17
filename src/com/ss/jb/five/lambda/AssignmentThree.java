package com.ss.jb.five.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentThree {

    /**
     * Accepts a list, starting character and length of string, returning all values in the list which match the specifications
     * @param list
     * @param start
     * @param length
     * @return
     */
    public static List<String> searchByStartAndLen(List<String> list, char start, int length) {
        return list.stream()
                .filter((s) -> s.charAt(0) == start && s.length() == length)
                .collect(Collectors.toList());
    }

}
