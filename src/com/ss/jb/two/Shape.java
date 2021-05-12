package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public interface Shape {

    double calculateArea();

    /**
     * Displays the class name of this object and the area of this shape
     */
    default void display() {
        System.out.println("The area of this " + getClass().getSimpleName() + " is " + calculateArea());
    }

}
