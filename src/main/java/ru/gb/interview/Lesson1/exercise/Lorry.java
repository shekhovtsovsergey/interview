package ru.gb.interview.Lesson1.exercise;

class Lorry extends Car, Moveable, Stopable {
    //нельзя наследовать интерфейсы надо имплементиовать их
    //надо имплементировать метод open

    public void move(){
        System.out.println("Car is moving");
    }

    public void stop(){
        System.out.println("Car is stop");
    }
}
