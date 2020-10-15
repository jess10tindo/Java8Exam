package com.dtcc.exams.part4;

public class Geometry implements Rectangle, Circle {

    Integer height;
    Integer width;
    Integer radius;

    public Geometry() {
        this.height = 0;
        this.width = 0;
        this.radius = 0;
    }

    public Geometry(Integer height, Integer width, Integer radius) {
        this.height = height;
        this.width = width;
        this.radius = radius;
    }

    public int area(int height, int width) {
        return height * width;
    }

    public double area(int radius) {
        return (3.14 * (radius * radius));
    }

    public int getArea(Integer height, Integer width) {
        return area(height, width);
    }

    public double getArea(Integer radius) {
        return area(radius);
    }
}


