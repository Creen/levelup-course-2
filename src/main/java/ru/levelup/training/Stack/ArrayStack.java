package ru.levelup.training.Stack;

public class ArrayStack {

    private int mSize;
    private int [] stackArray;
    private int top;

    public ArrayStack(int m){
        this.mSize = m;
        stackArray = new int[mSize];
        top = -1;
    }

    public void addElement(int element){
        stackArray[++top] = element;
    }

    public int deleteElement(){
       return stackArray[top--];
    }

    public int readTop(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == mSize - 1);
    }

    public void print(ArrayStack arrayStack){
        while (!arrayStack.isEmpty()){
            int value = arrayStack.deleteElement();
            System.out.println(value + " ");
        }
    }
}
