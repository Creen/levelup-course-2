package ru.levelup.lesson01.Homework;

import java.io.Serializable;

public class Monitor implements Serializable {

    private String name;
    private String model;
    private String price;

    public Monitor(){}

    public Monitor (String name, String model, String price){
        this.name = name;
        this.model = model;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String  getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Монитор" + name + "," + model + "," + price;
    }
}
