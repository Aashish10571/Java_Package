package com.shapes;

class Sphere extends Shape {
    @Override
    public double area() {
        return 4 * this.getPI() * this.getRadius() * this.getRadius();
    }

    @Override
    public double volume() {
        return (4 * this.getPI() * this.getRadius() * this.getRadius() * this.getRadius()) / 3;
    }
}