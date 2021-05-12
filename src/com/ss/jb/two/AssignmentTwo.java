package com.ss.jb.two;

import java.util.Random;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class AssignmentTwo {

	/**
	 * Construct a 2D array of random numbers and find and display the largest number and it's index
	 * @param args
	 */
	public static void main(String[] args) {
		AssignmentTwo assignment = new AssignmentTwo();
		assignment.displayLargest();
	}

	private final int[][] array;

	/**
	 * Construct a 2D array and fill it with random numbers and prints the values
	 */
	public AssignmentTwo() {
		array = new int[10][10];
		Random random = new Random();
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				int num = random.nextInt(100);
				array[x][y] = num;
				System.out.print(num + (y < array[x].length - 1 ? "," : ""));
				int spaceCount = 0;
				while ((num /= 10) > 0) {
					spaceCount++;
				}
				for (int i = 0; i < 2 - spaceCount; i++) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	/**
	 * Find the largest number in the array and display its row and column index location
	 */
	public void displayLargest() {
		int largest = array[0][0];
		int largestX = 0;
		int largestY = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				if (array[x][y] > largest) {
					largest = array[x][y];
					largestX = x;
					largestY = y;
				}
			}
		}
		System.out.println("Largest number contained in the array is " + largest + ", located at [" + largestX + "][" + largestY + "]");
	}

}
