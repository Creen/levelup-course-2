package ru.levelup.Lesson03.Homework;

public class App {

    public static void main(String[] args) {
        OneLinkedList<String> stack = new OneLinkedList<>(10);
        stack.push("JavaLove");
        stack.push("JavaLove2");
        stack.push("JavaLove3");
        stack.push("d");
        stack.push("l");
        stack.push("s");



//        System.out.println(stack.pop());
        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

    }
}