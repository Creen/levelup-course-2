package ru.levelup.Lesson03.Homework;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T>  {

    private T val;
    private  int size;
    private  int count;
    private LinkedList item = new LinkedList();

    public StackLinkedList(T arg){
        this.val = arg;
        size = item.size();
    }
    public void push (T valeo){
//        if (size == count){
//            throw new StackOverflowError("Стек переполенен");
//        } else {
            item.addLast(valeo);
//        }
        count++;
    }
    public T pop(){
        if (item == null){
            throw new EmptyStackException();
        }
        T result = (T) item.getLast();
        item.removeLast();
        return result;
    }
    public T peek() {
        if (item == null){
            throw new EmptyStackException();
        }
        return (T) item.getLast();
    }
}
