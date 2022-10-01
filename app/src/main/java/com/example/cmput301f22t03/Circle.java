package com.example.cmput301f22t03;

public class Circle extends Shape {
    private Integer radius;

    public Circle (Integer x, Integer y, Integer radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Integer getRadius() {
        return radius;
    }

    public void setRadius(Integer radius) {
        this.radius = radius;
    }
}
