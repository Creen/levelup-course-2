package ru.levelup.lesson03.homework;

import java.util.EmptyStackException;

//Реализация односвязного списка
public class OneLinkedList<T>  {

    private NodeOLL head; // указатель на первый элемент
    private int size; //размер списка
    private int count; // счетик

    //Конструктор для указания размерности
    public OneLinkedList(int size) {
        this.size = size;
    }
    public OneLinkedList(){

    }

    //нутренний класс, который представляет собой элемент списка
    public class NodeOLL <T>{
        //Данные
        T value;
        //Указатель на следующий слемент
        NodeOLL next;
        NodeOLL(T value) {
            this.value = value;
        }
    }

    //Добавляет элемент на вершину стека.
    public void push (T value){
            NodeOLL stackElement = new NodeOLL(value);
        if (size == count){
            throw new StackOverflowError();
        } else if(head == null){ //если список пуст
                head = stackElement; //то указываем ссылку начала на новый элемент
        } else {
                stackElement.next = head; //иначе "старый" последний элемент теперь ссылается на новый
                head = stackElement; //а в указатель на последний элемент записываем адрес нового элемента
            }
            count++;

    }
    //Удаляет элемент с вершины стека и возвращает его.
    public T pop(){

        if(head == null){
            throw new EmptyStackException();
        } else {
            T value = (T) head.value; //записываем данные о верхнем элементе
            head = head.next; //переназначим указатель на голову на второй элемент списка, а голову удалим
            count--;
            return value;
        }

    }
    //Возвращает верхний элемент стека, но не удаляет его.
    public T peek() {
        if(head == null){
            throw new EmptyStackException();
        } else {
            T value = (T) head.value; //записываем данные о верхнем элементе
            return value;
        }
    }
}


