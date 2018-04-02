package ru.levelup.Training;

public class BubbleSorting {
    public static void main(String[] args) {

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Sorting
        //Пар за один пробег: N-1
        //Пробегов: N-1
        for (int i = 0; i < array.length - 1; i++) {
            //Пробег ->
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
