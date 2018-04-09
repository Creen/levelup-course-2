package ru.levelup.lesson02.Lessonwork;

public class App {

    public static void main(String[] args) throws IllegalAccessException {

        Person person = new Person();
        RandomIntProcessor.process(person);
        System.out.println(person.getAge());

    }
}
