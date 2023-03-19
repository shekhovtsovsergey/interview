package ru.gb.interview.Lesson1.exercise;

abstract class Car {

    public Engine engine;//нет такого класса Engine
    private String color;
    private String name;

    protected void start() {
        System.out.println("Car starting");
    }

    abstract void open();

    public Engine getEngine() {//нет такого типа
        return engine;
    }

    public void setEngine(Engine engine) {//нет такого класса Engine
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

