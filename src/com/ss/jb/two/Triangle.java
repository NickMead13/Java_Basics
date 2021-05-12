package com.ss.jb.two;

/**
 * @author NickM13
 * @since 5/11/2021
 */
public class Triangle implements Shape {

    private final int base, height;

    /**
     * Construct a triangle with a base size length and a height
     * @param base
     * @param height
     */
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculate the area of the triangle using Base * Height / 2
     * @return Area
     */
    @Override
    public double calculateArea() {
        return base * height / 2.;
    }

}
