package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class AssignmentThree {

	/**
	 * Create a rectangle, circle, and triangle, and display their areas
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(5, 10);
		rect.display();

		Circle circle = new Circle(10);
		circle.display();

		Triangle triangle = new Triangle(8, 5);
		triangle.display();
	}

}
