package ru.levelup.Lesson03.Homework;

import java.util.EmptyStackException;

public class List<T>  {

    private StackElement head; // указатель на первый элемент

    //singly-linked list
    public class StackElement <T>{
        //Данные
        T value;

        //Указатель на следующий слемент
        StackElement next;

        StackElement(T value) {
            this.value = value;
        }
    }

    //Добавляет элемент на вершину стека.
    public void push (T value){
            StackElement stackElement = new StackElement(value);
            if(head == null){ //если список пуст
                head = stackElement; //то указываем ссылку начала на новый элемент
        }  else {
                stackElement.next = head; //иначе "старый" последний элемент теперь ссылается на новый
                head = stackElement; //а в указатель на последний элемент записываем адрес нового элемента
            }
    }
    //Удаляет элемент с вершины стека и возвращает его.
    public T pop(){
        if(head == null){
            throw new EmptyStackException();
        } else {
            T value = (T) head.value;
            head = head.next;
            return value;
        }

    }
    //Возвращает верхний элемент стека, но не удаляет его.
    public T peek() {

    }


}


