package ru.levelup.lesson11;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7,8,9,0)
        );
//        Collections.sort(integers, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return -Integer.compare(o1, o2);
//            }
//        });

        Collections.sort(integers, (o1, o2) -> {
            return -Integer.compare(o1, o2);
        });

        System.out.println(integers.toString());

        integers.forEach(System.out::println);
    }
}
