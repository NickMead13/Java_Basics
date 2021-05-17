package com.ss.jb.five.lambda;

import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentOne {

    /**
     * Sort a list of names by their lengths, from short to long
     * @return Sorted list
     */
    public List<String> sortByLength(List<String> names) {
        names.sort((s1, s2) -> s1.length() - s2.length());
        return names;
    }

    /**
     * Sort a list of names by their lengths, from long to short
     * @return Sorted list
     */
    public List<String> sortByLengthReverse(List<String> names) {
        names.sort((s1, s2) -> s2.length() - s1.length());
        return names;
    }

    /**
     * Todo: Possible issue, should the case of the letter be taken into account?
     * Sort a list of names by their first character alphabetically
     * @return Sorted list
     */
    public List<String> sortByFirstChar(List<String> names) {
        names.sort((s1, s2) -> s1.charAt(0) - s2.charAt(0));
        return names;
    }

    /**
     * Sort a list of names by whether or not the first character is an 'e' (non-case sensitive)
     * @return Sorted list
     */
    public List<String> sortByE(List<String> names) {
        names.sort((s1, s2) -> s1.toLowerCase().charAt(0) == 'e' ? s2.toLowerCase().charAt(0) == 'e' ? 0 : -1 : s2.toLowerCase().charAt(0) == 'e' ? 1 : 0);
        return names;
    }

    /**
     * Sort a list of names by whether or not the first character is an 'e' (non-case sensitive)
     * Makes use of a static helper method instead of a lambda (see {@link #sortByE(List)} )})
     * @return Sorted list
     */
    public List<String> sortByEWithHelper(List<String> names) {
        names.sort(Utils::sortByE);
        return names;
    }

}
