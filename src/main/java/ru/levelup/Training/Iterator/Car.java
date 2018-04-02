package ru.levelup.Training.Iterator;

public class Car implements Comparable <Car>{

    private String name;
    private int yaer;

    //Конструкторы
    public Car (String name){
        this.name = name;
    }
    public Car(String name, int yaer) {
        this.name = name;
        this.yaer = yaer;
    }

    //Геттеры и Сеттеры
    public int getYaer() {
        return yaer;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setYaer(int yaer){
        this.yaer = yaer;
    }

//    @Override
//    public String toString() {
//        return "Car{" +
//                "name='" + name + '\'' +
//                ", yaer=" + yaer +
//                '}';
//    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Car car) {
        return this.name.compareTo(car.getName());
    }
}
