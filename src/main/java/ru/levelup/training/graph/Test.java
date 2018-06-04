package ru.levelup.training.graph;

public class Test {

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.insertElement(23);
        queue.insertElement(2);
        queue.insertElement(55);

        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }
    }
}
