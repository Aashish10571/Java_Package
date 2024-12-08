package com.shapes;

class Rectangle extends Shape {
    @Override
    public double area() {
        return this.getLength() * this.getBreadth();
    }
}