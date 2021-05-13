package com.ss.jb.three;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * @author NickM13
 * @since 5/12/2021
 */
public class AssignmentTwo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.initFile();
        assignment.appendInput();
    }

    private static final String fileName = "D3A2-output.txt";

    public AssignmentTwo() {

    }

    /**
     * Creates a new file if it doesn't already exist
     */
    public void initFile() {
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("Created new file " + fileName);
            } else {
                System.out.println("Appending to file " + fileName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Append a line the user enters and a \n to the end of the file
     */
    public void appendInput() {
        System.out.println("Enter a line to be appended to the text file");
        Scanner scanner = new Scanner(System.in);
        try {
            Files.write(Paths.get(fileName), (scanner.nextLine() + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
