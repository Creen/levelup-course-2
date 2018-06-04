package ru.levelup.training.algorithms;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5, 1};
        System.out.println("До: " + "\t" + Arrays.toString(arr));
        System.out.println("После: " + "\t" + Arrays.toString(sort(arr)));
    }

    private static int[] sort(int array[]){
        if(array.length == 1){
            return array;
        } else {
            //Разбиваем массив на два пустых
            int middle = (int)Math.floor(array.length/2);
            int[] left = new int[middle];
            int[] right = new int[array.length - middle];
            //Заполняем
            for (int i = 0; i < array.length; i++) {
                if(i < middle){
                    left[i] = array[i];
                } else {
                    right[i - middle] = array[i];
                }
            }
            //Рекурсивно разбиваем остальные
            left = sort(left);
            right = sort(right);

            array = mergeArray(left, right);
            return array;
        }
    }

    private static int[] mergeArray(int[] left,  int[] rigth){
        int[] array = new int[left.length + rigth.length];
        int indexLeft = 0, indexRight = 0;
        //Савниваем массивы и переставляем элементы
        for (int i = 0; i < array.length; i++) {
            if (indexLeft == left.length){
                array[i] = rigth[indexRight];
                ++indexRight;
            } else
            if(indexRight == rigth.length){
                array[i] = left[indexLeft];
                ++indexLeft;
            } else
            if (left[indexLeft] > rigth[indexRight]){
                array[i] = rigth[indexRight];
                ++indexRight;
            } else {
                array[i] = left[indexLeft];
                ++indexLeft;
            }
        }
        return array;
    }
}
