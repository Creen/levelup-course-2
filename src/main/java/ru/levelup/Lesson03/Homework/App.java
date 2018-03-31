package ru.levelup.Lesson03.Homework;

public class App {

    public static void main(String[] args) {
        List stack = new List(5);
        stack.push(3);
        stack.pop();
        stack.push(4);



        System.out.println(stack.peek());

    }
}