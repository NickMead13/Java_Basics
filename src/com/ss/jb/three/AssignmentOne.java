package com.ss.jb.three;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author NickM13
 * @since 5/12/2021
 */
public class AssignmentOne {

    /**
     * @param args
     */
    public static void main(String[] args) {
        printFiles(".", 0);
    }

    /**
     * Recursively print all files and sub-directory files in a given directory, with an indent in the console to
     * see branches easier
     * @param directory
     * @param indent
     */
    public static void printFiles(String directory, int indent) {
        File file;
        try {
            file = new File(directory);
        } catch (NullPointerException e) {
            System.out.println("No directory found");
            return;
        }
        if (!file.isDirectory()) {
            System.out.println("That's not a directory!");
            return;
        }
        try {
            for (File f : file.listFiles()) {
                printIndent(indent);
                System.out.println(f.getName());
                if (f.isDirectory()) {
                    printFiles(f.getAbsolutePath(), indent + 1);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Problem reading file/directory " + file.getName());
        }
    }

    /**
     * Prints a repeated number of spaces
     * @param indent
     */
    private static void printIndent(int indent) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append(" ");
        }
        System.out.print(builder.toString());
    }

}
