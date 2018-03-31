package ru.levelup.Lesson03.Lessonwork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RandomInt {

    //Аннотация хранит значения мин и макс
    //Метод у которого нет тела, с дефорлтным знач.
    int min();

    int max() default 100;

}
