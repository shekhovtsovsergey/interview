package ru.gb.interview.Lesson2.Task1;

public class LinkedContainer<T> implements Linked {

    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedContainer() {
        first = null;
        last = null;
        size = 0;
    }


    @Override
    public void add(Object item) {
        Node<T> newNode = (Node<T>) new Node<>(item);
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
            last = newNode;
        }
        size++;
    }

    @Override
    public void remove(Object item) {
        Node<T> currentNode = first;
        while (currentNode != null) {
            if (currentNode.item.equals(item)) {
                if (currentNode == first) {
                    first = currentNode.next;
                } else if (currentNode == last) {
                    last = currentNode.prev;
                } else {
                    currentNode.prev.next = currentNode.next;
                    currentNode.next.prev = currentNode.prev;
                }
                size--;
                break;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
        Node<T> currentNode;
        if (index < size / 2) {
            currentNode = first;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
        } else {
            currentNode = last;
            for (int i = size - 1; i > index; i--) {
                currentNode = currentNode.prev;
            }
        }
        return currentNode.item;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }
}
