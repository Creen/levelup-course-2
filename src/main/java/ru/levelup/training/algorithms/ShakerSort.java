package ru.levelup.training.algorithms;

import java.util.Arrays;

public class ShakerSort {

    public static void main(String[] args) {
        int[] arr = {6, 4, 1, 3, 5, 1};
        System.out.println("До: " + "\t" + Arrays.toString(arr));
        arrSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void arrSort(int[] name) {
        int b = 0;
        int left = 0;//Левая граница
        int right = name.length - 1;//Правая граница
        while(left < right)
        {
            for (int i = left; i < right; i++)//Слева направо...
            {
                if (name[i] > name[i + 1])
                {
                    b = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = b;
                    b = i;
                }
            }
            right = b;//Сохраним последнюю перестановку как границу
            if (left >= right) break;//Если границы сошлись выходим
            for (int i = right; i > left; i--)//Справа налево...
            {
                if (name[i-1] > name[i])
                {
                    b = name[i];
                    name[i] = name[i-1];
                    name[i -1] = b;
                    b = i;
                }
            }
            left = b;//Сохраним последнюю перестановку как границу
        }
    }

}
