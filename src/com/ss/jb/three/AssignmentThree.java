package com.ss.jb.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author NickM13
 * @since 5/12/2021
 */
public class AssignmentThree {

    /**
     * Merge the arguments into a string and call the string count method
     * @param args
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Command line search term missing");
            return;
        }

        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            if (builder.length() != 0) builder.append(" ");
            builder.append(arg);
        }

        String search = builder.toString();
        int count = getSearchCount(search);

        if (count != -1) {
            System.out.println("Character count of '" + search + "' in file " + fileName + ": " + count);
        }
    }

    private static final String fileName = "D3A3-input.txt";

    /**
     * Count the number of times a phrase appears in the text file
     * @param search
     */
    private static int getSearchCount(String search) {
        int count = 0;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);

            String line;
            int searchIndex;
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                searchIndex = 0;
                for (char c : line.toCharArray()) {
                    if (c == search.charAt(searchIndex)) {
                        searchIndex++;
                        if (searchIndex >= search.length()) {
                            count++;
                            searchIndex = 0;
                        }
                    } else {
                        searchIndex = 0;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " was not found");
            return -1;
        }
        return count;
    }

}
