package ru.levelup.Lesson03.Homework;

public class List<T>  {


    //Добавляет элемент на вершину стека.
    public void push (T valeo){

    }
    //Удаляет элемент с вершины стека и возвращает его. Если стек пустой, кидает InvalidOperationException.
    public T pop(){

    }
    //Возвращает верхний элемент стека, но не удаляет его. Если стек пустой, кидает InvalidOperationException.
    public T peek() {

    }

    //singly-linked list
    public class ListNode <T>{
        //Данные
        T val;

        //Указатель на следующий слемент
        ListNode next;

        ListNode(T x) {
            val = x;
            next = null;
        }
    }
}


