package ru.levelup.Training.Stack;

public class Stack {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);
        stack.addElement(1);
        stack.addElement(2);
        stack.addElement(3);
        stack.addElement(4);
        stack.addElement(5);

        stack.print(stack);
    }
}
