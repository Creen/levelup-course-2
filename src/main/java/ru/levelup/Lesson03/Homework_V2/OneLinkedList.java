package ru.levelup.Lesson03.Homework_V2;

import java.util.EmptyStackException;


//Класс с реализацией базовых операций стека. Внутри себя использует OneLinkedList<T> для манипуляции данными.
class OneLinkedListStack<T> {

    public int size;
    public OneLinkedListStack(int size){
        this.size = size;
    }
    public OneLinkedListStack(){

    }

    public OneLinkedList<T> oneLinkedList = new OneLinkedList<T>(size);

    public void push(T date){
        oneLinkedList.addFirst(date);
    }

    public T pop(){
        return oneLinkedList.removeFirst();
    }

    public T peek(){
       return oneLinkedList.returnFirst();
    }
}

//Реализация односвязного списка
class OneLinkedList<T>  {

    private NodeOLL<T> first = null; // указатель на первый элемент
    public int size; //размер списка
    public int count;

    //Конструктор для указания размерности
    public OneLinkedList(int size) {
        this.size = size;
    }
    public OneLinkedList(){

    }

    //Внутренний класс, который представляет собой элемент списка
    private static class NodeOLL <T>{
        //Данные
        private T data;
        //Указатель на следующий слемент
        private NodeOLL<T> next;
        public NodeOLL(T data) {
            this.data = data;
        }
    }

    //Для метода push(), который добавляет элемент на вершину
    public void addFirst(T data){
        NodeOLL<T> newFirst = new NodeOLL<T>(data);
        if (size == count){
            throw new StackOverflowError();
        } else {
            newFirst.next = first;
            first = newFirst;
        }
        count++;
    }

    //Для метода pop(), который удаляет элемент с вершины стека и возвращает его.
    public T removeFirst(){
        NodeOLL<T> oldFirst = first;
        if(isEmpty()){
            throw new EmptyStackException();
        } else {
            first = first.next;
            count--;
            return oldFirst.data;
        }
    }

    //Для метода peek(), который возвращает верхний элемент стека, но не удаляет его.
    public T returnFirst (){
        if(isEmpty()){
            throw new EmptyStackException();
        } else {
            return (T) first;
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

}


