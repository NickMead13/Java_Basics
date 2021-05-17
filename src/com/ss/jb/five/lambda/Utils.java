package com.ss.jb.five.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class Utils {

    public static int sortByE(String s1, String s2) {
        if (s1.toLowerCase().charAt(0) == 'e') {
            return s2.toLowerCase().charAt(0) == 'e' ? 0 : -1;
        } else {
            return s2.toLowerCase().charAt(0) == 'e' ? 1 : 0;
        }
    }

}
