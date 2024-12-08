package com.shapes;

class Cylinder extends Shape {
    @Override
    public double area() {
        return 2 * this.getPI() * this.getRadius() * this.getHeight() + 2 * this.getPI() * this.getRadius() * this.getRadius();
    }

    @Override
    public double volume() {
        return this.getPI() * this.getRadius() * this.getRadius() * this.getHeight();
    }
}