package com.xtl.base;


/**
 * 圆形
 * @author 31925
 */
public class Circle implements Shape{
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return 3.14*radius;
    }

    @Override
    public Double perimeter() {
        return 2*3.14*radius;
    }
}
