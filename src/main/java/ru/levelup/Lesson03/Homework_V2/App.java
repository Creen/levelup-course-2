package ru.levelup.Lesson03.Homework_V2;


public class App {

    public static void main(String[] args) {
        OneLinkedListStack<String> oneLinkedListStack = new OneLinkedListStack<>(4);
        oneLinkedListStack.push("1");
        oneLinkedListStack.push("2");
        oneLinkedListStack.push("5");
        oneLinkedListStack.push("6");
        oneLinkedListStack.push("7");

        oneLinkedListStack.print(oneLinkedListStack);
    }
}