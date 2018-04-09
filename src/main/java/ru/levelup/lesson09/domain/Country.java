package ru.levelup.lesson09.domain;

import javax.persistence.*;

//Эта аннотация указывает Hibernate, что данный класс является сущностью
@Entity
//С помощью этой аннотации мы говорим Hibernate,  с какой именно
// таблицей необходимо связать (map) данный класс. И указываем имя таблицы.
@Table(name = "country")
public class Country {

    //Указываем первичный ключ (Primary Key) данного класса.
    @Id
    //определяет к какому столбцу в таблице БД относится конкретное поле класса (аттрибут класса).
    @Column
    //Эта аннотация используется вместе с аннотацией @Id и определяет такие паметры, как strategy и generator.
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id_gen")
    @SequenceGenerator(name = "country_id_gen", allocationSize = 20,
            sequenceName = "alloc_country_id", initialValue = 10000)
    private int id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false, unique = true)
    private String capital;

    @Column
    private double population;

    public Country(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }
}
