package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class AssignmentOne {

	/**
	 * Accepts a series of arguments from the command line and adds them together
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("You didn't enter any arguments!");
			return;
		}
		double total = 0;
		int nonNumbers = 0;
		StringBuilder builder = new StringBuilder();
		for (String arg : args) {
			if (builder.length() > 0) builder.append(" + ");
			try {
				total += Double.parseDouble(arg);
				builder.append(arg);
			} catch (NumberFormatException e) {
				nonNumbers++;
				builder.append("?");
			}
		}
		if (nonNumbers > 0) {
			System.out.println(nonNumbers + " of the arguments you passed were not numbers!");
		}

		builder.append(" = ");
		builder.append(total);
		System.out.println(builder.toString());
	}

}
