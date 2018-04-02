package ru.levelup.Training.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Start {

    public static ArrayList<Car> cars = new ArrayList();

    public static void main(String[] args) {

        Car car1 = new Car("Katya", 1996);
        Car car2 = new Car("Nina", 1993);
        Car car3 = new Car("Volga", 1990);
        Car car4 = new Car("Kia", 1976);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        print();

        Collections.sort(cars, new CarNameComparator());
        print();

        Collections.sort(cars, new CarYearComparator());
        print();

    }

    public static void print(){
        System.out.println();
        Iterator<Car> iterator = cars.iterator();

        while (iterator.hasNext()){
            Car car = iterator.next();
            System.out.println(car.getName() + ": " + car.getYaer() + ".");
        }
     }
}

