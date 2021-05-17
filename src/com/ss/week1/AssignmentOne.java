package com.ss.week1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author NickM13
 * @since 5/14/2021
 */
public class AssignmentOne {

    /**
     * Check whether a number is odd or not
     */
    private static final PerformOperation isOdd = num -> {
        if (num % 2 == 1) {
            System.out.println("ODD");
        } else {
            System.out.println("EVEN");
        }
    };

    /**
     * Check whether a number is prime or not
     */
    private static final PerformOperation isPrime = num -> {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                System.out.println("COMPOSITE");
                return;
            }
        }
        System.out.println("PRIME");
    };

    /**
     * Check whether a number is palindrome or not
     */
    private static final PerformOperation isPalindrome = num -> {
        List<Integer> forward = new ArrayList<>();
        do {
            forward.add(num % 10);
            num /= 10;
        } while (num > 0);
        for (int i = 0; i < forward.size() / 2; i++) {
            if (!forward.get(i).equals(forward.get(forward.size() - i - 1))) {
                System.out.println("NOT PALINDROME");
                return;
            }
        }
        System.out.println("PALINDROME");
    };

    /**
     * Reads
     * @param args
     */
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("W1A1-input.txt"));

            int count = Integer.parseInt(reader.readLine());
            for (int i = 0; i < count; i++) {
                String[] parts = reader.readLine().split(" ");
                int type = Integer.parseInt(parts[0]);
                int value = Integer.parseInt(parts[1]);

                switch (type) {
                    case 1:
                        isOdd.accept(value);
                        break;
                    case 2:
                        isPrime.accept(value);
                        break;
                    case 3:
                        isPalindrome.accept(value);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
