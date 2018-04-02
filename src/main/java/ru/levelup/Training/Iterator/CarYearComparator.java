package ru.levelup.Training.Iterator;

import java.util.Comparator;

public class CarYearComparator implements Comparator <Car> {
    @Override
    public int compare(Car car1, Car car2) {
        Integer year1 = new Integer(car1.getYaer());
        Integer year2 = car2.getYaer();
        return year1.compareTo(year2);
    }
}
