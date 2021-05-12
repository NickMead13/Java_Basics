package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class Circle implements Shape {

    private final int radius;

    /**
     * Construct a circle with a radius
     * @param radius
     */
    public Circle(int radius) {
        this.radius = radius;
    }

    /**
     * Calculate the area of the circle using PI * R^2
     * @return
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
