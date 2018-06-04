package ru.levelup.training.algorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5, 1};
        System.out.println("До: " + "\t" + Arrays.toString(arr));
        insertIntoSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertIntoSort(int[] arr) {
        int temp, j;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }
    }
}
