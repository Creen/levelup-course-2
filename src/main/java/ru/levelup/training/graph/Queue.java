package ru.levelup.training.graph;

//Очередь для обхода графа
public class Queue {

    //для хранения элементов
    private int[] arr;

    //количество элементов в очереди
    private int size;

    //текущее количество
    private int count;

    //начальный элемент в очереди
    private int first;

    //конечнй элемент в очереди
    private int end;

    public Queue(int size) {
        this.size = size;
        arr = new int[size];
        count = 0;
        first = 0;
        end = -1;
    }

    //добавление элемента в конец очереди
    public void insertElement(int element){
        //Выполняем предварительную проверку, не достигло ли значение end конца массива.
        //Если это так, то мы переносим маркер end в самое начало очереди, чтобы использовать пустые ячейки снова.
        if(end == size - 1){
            end = -1;
        }
        arr[++end] = element;
        count++;
    }

    //извлечение элемента из начала очереди
    public int pop(){
        int temp = arr[first++];
        if (first == size){
            first = 0;
        }
        count--;
        return temp;
    }

    public int size(){
        return count;
    }

    public boolean isEmpty(){
        return (count == 0);
    }

}
