package ru.gb.interview.Lesson1.builder;

public class Main {

    public static void main(String[] args) {

        Person person = new Person.Builder()
                .setFirstName("John")
                .setLastName("Doe")
                .setAddress("adress")
                .setMiddleName("")
                .setGender("")
                .setPhone("")
                .setCountry("USA")
                .setAge(30)
                .build();

        System.out.println(person);
    }

}
