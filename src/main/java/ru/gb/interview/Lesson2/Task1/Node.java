package ru.gb.interview.Lesson2.Task1;


public class Node <T>{

    T item;
    Node<T> prev;
    Node<T> next;

    Node(T item) {
        this.item = item;
    }

}
