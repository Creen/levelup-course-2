package ru.levelup.Lesson03.Homework;

public class List<T>  {



    public void push (T valeo){
//
    }
    public T pop(){

    }
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


