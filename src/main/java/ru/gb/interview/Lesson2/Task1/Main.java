package ru.gb.interview.Lesson2.Task1;

public class Main {

    public static void main(String[] args) {
        Linked<String> linked = new LinkedContainer<String>();

        linked.add("1");
        linked.add("2");
        linked.add("3");

        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

        System.out.println("========================================");

        linked.remove("2");

        for (int i = 0; i < linked.size(); i++) {
            System.out.println(linked.get(i));
        }

    }
}
