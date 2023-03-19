package ru.gb.interview.Lesson1.polymorphism;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {new Circle(5), new Square(4), new Triangle(3, 6)};
        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getClass().getSimpleName() + " is " + shape.getArea());
        }
    }
}
