package com.example.cmput301f22t03;

public class Ellipse extends Shape{
    private Integer a;
    private Integer b;

    public Ellipse(Integer x, Integer y, Integer a, Integer b) {
        this.x = x;
        this.y = y;
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
