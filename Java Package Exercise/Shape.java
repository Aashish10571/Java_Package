package com.shapes;

class Shape {
    private double length, breadth, height, radius;
    private static final double PI = 3.14;

    public double area() {
         System.out.println("calculating area...");
        return 0;
    }

    public double volume() {
        System.out.println("calculating volume...");
        return 0;
    }

    public void setLength(double length) {
        this.length = length;
    }

     public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

     public void setHeight(double height) {
        this.height = height;
    }

     public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return this.length;
    }

     public double getBreadth() {
        return this.breadth;
    }

     public double getHeight() {
        return this.height;
    }

     public double getRadius() {
        return this.radius;
    }

    public double getPI() {
        return this.PI;
    }
}