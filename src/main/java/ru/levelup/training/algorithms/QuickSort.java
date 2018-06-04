package ru.levelup.training.algorithms;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5, 1};
        System.out.println("До: " + "\t" + Arrays.toString(arr));

        quickSort(arr, 0, arr.length-1);
        System.out.print("После: " + "\t" + Arrays.toString(arr));
    }

    //Эта функция выполняет в один проход по массиву разбиение массива на 2 части
    public static int partition(int arr[], int left, int right){

        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }

    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}
