package com.shapes;

class Square extends Shape {
       @Override
    public double area() {
        return this.getLength() * this.getLength();
    }
}