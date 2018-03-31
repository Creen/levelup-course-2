package ru.levelup.Lesson02.Homework;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        AllObjects listObjects = new AllObjects();
        Arrays.stream(listObjects.getObjects("ru.levelup.Lesson02")).forEach(System.out::println);


    }
}
