package ru.levelup.lesson01.Homework;

import java.io.*;
import java.lang.reflect.Field;

public class MR {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, IOException {

        try {
            //Читаем данных из файла
            BufferedReader br = new BufferedReader(new FileReader("Monitor.txt"));
            String st = br.readLine();
            //Проверка
            System.out.println(st);
            //Чтение всех строк в файле
//            while ((st = br.readLine()) != null){
//                System.out.println(st);
//            }
            //Разбиение строки на слова с помощью разграничителя ","
            String [] stWord  = st.split(",");
//            for (int i = 0; i < stWord.length; i++) {
//                System.out.println(stWord[i]);
//            }
            //Теперь надо заполнить этими данными поля у объекта.
            Monitor monitor = new Monitor();
            System.out.println(monitor); //Пока они null,null,null
            //Для этого получаем объект типа Class
            Class monitorClass = monitor.getClass();

            //Получаем массив с объектами Field getDeclaredFields(),
            // устанавливаем разрешение для доступа к полю setAccessible(true)
            // и устанавливаем значения из массива stWord_ ТУТ я не уверен
            Field [] field ;
            field = monitorClass.getDeclaredFields();
            for (int i = 0; i < field.length; i++) {
                field[i].setAccessible(true);
                field[i].set(monitor, stWord[i]);
            }
            System.out.println(monitor);
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
