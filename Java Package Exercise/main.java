package com.shapes;

public class main {
    public static void main(String[] args) {
        System.out.println();
        
        Circle circle = new Circle();
        circle.setRadius(5);

        System.out.println("Circle");
        System.out.println();
        System.out.println("area : " + circle.area());
        System.out.println();

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(5);
        cylinder.setHeight(3);

        System.out.println("Cylinder");
        System.out.println();
        System.out.println("area : " + cylinder.area());
        System.out.println("volume : " + cylinder.volume());
        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(6);
        rectangle.setBreadth(5);

        System.out.println("Rectangle");
        System.out.println();
        System.out.println("area : " + rectangle.area());
        System.out.println();

        Sphere sphere = new Sphere();
        sphere.setRadius(5);
        sphere.setHeight(3);

        System.out.println("Sphere");
        System.out.println();
        System.out.println("area : " + sphere.area());
        System.out.println("volume : " + sphere.volume());
        System.out.println();

        Square square = new Square();
        square.setLength(4);

        System.out.println("Square");
        System.out.println();
        System.out.println("area : " + square.area());
        System.out.println();        
    }
}