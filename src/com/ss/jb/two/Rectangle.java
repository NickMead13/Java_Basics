package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class Rectangle implements Shape {

    private final int width, height;

    /**
     * Construct a rectangle with a specified width and height
     * @param width
     * @param height
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculate the area of the rectangle using Width * Height
     * @return
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

}
