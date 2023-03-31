package ru.gb.interview.Lesson2.Task1;

public interface Linked <T>{

    public void add(T item);
    public void remove(T item);
    public T get(int index);
    public boolean isEmpty();
    public int size();

}
