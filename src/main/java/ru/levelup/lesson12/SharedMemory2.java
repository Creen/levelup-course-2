package ru.levelup.lesson12;

public class SharedMemory2 {

    private static Value value = new Value();

    public static void main(String[] args) {
        new Thread(new Increment()).start();
        new Thread(new Decrement()).start();
    }

    private static class Value{
        private int value;
        public synchronized void increment(){
            value ++;
        }
        public synchronized void decrement(){
            value --;
        }
        public synchronized int getValue(){
            return value;
        }
    }

    private static class Increment implements Runnable{

        @Override
        public void run() {
            while (value.getValue() < 20){
                value.increment();
                System.out.println("Inc" + value.getValue());

            }
        }
    }

    private static class Decrement implements Runnable{

        @Override
        public void run() {
            while (value.getValue() > 0){
                value.decrement();
                System.out.println("dec" + value.getValue());

            }
        }
    }

}

