package ru.levelup.lesson02.Lessonwork;

import java.lang.reflect.Field;
import java.util.Random;

//То что генерирует и устанавливает значение
public class RandomIntProcessor {

    //Метод отвечающий за уствновку рандом инт
    //Устанавливаем значение у поля, помеченного аннотацией
    public static void process(Object object) throws IllegalAccessException {
        final Class objectClass = object.getClass();
        //Нужно получить поля, чтобы найти где стоит аннотация
        final Field[] fields = objectClass.getDeclaredFields();
        for (Field field : fields){
            //Объект класса Class об аннотации
            final RandomInt annotation = field.getAnnotation(RandomInt.class);
            //нужно проверить что вернудось
            if (annotation != null) {
                //Задать рандомное значение от мин до макс
                // и присвоить нашему field
                int random = new Random().nextInt(annotation.max() - annotation.min()) + annotation.min();
                //Установить значение в поле
                field.setAccessible(true);
                field.set(object, random);
            }

        }

    }

}
