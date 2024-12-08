package com.shapes;

class Circle extends Shape {
     @Override
     public double area() {
        return this.getPI() * this.getRadius() * this.getRadius();
     }
}