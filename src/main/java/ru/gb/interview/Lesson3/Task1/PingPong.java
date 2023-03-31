package ru.gb.interview.Lesson3.Task1;

public class PingPong {

    public static void main(String[] args) {
        Object lock = new Object(); // создаем объект-блокировку
        Thread t1 = new Thread(new Ping(lock)); // создаем поток Ping
        Thread t2 = new Thread(new Pong(lock)); // создаем поток Pong
        t1.start(); // запускаем поток Ping
        t2.start(); // запускаем поток Pong
    }
}
