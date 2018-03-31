package ru.levelup.Lesson02.Homework;
/*
Он возвращает объекты классов, которые находятся в данном пакете (параметр basePackage – название пакета, например, ru.levelup.lesson3).
В этом пакете находятся классы, у которых есть поля. К примеру, User или Monitor.
У этих классов у полей может стоять аннотация @RandomInt. У тех полей, у которых стоит эта аннотация должно быть проставлено
значение int. Другие поля в классе должны быть null или со значением по умолчанию.
На выходе у вас получится массив их созданных объектов. Чтобы создать объект можете
воспользоваться методом Object.class.newInstance(), но тогда сделайте пустой конструктор, иначе будет ошибка.
 */
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class AllObjects {

    public Object[] getObjects(String basePackage) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
//        List<Class> classes = new ArrayList<>();
//        List<Object> classes = new ArrayList<>();
        Object[] instanceObj = new Object[15];
//        List objectdd = (List) new Object();
        //Создадим объект File для данного каталога
        File filePackage = new File("src\\main\\java\\" + basePackage.replace(".", "\\"));
        //Список всех файлов в каталоге
        File[] fileList = filePackage.listFiles();
        int arrayCounter = 0;
        //Пробежимся по каталогу и найдем наши классы
        for ( int i = 0 ; i < fileList.length ; i++ ){
            //Надо проверить еще вот это boolean isDirectory()/ Проверяем если это не файл, то все ок, возможно, этот блок можно пропустить
            if (fileList[i].isDirectory()){
                continue;
            }
            if (!fileList[i].isFile()){
                continue;
            }
            //По имени получаем расчширение файла. Если расширение файла java, то ок
            String name = fileList[i].getName();
            System.out.println("name = " + name);
            if (name.endsWith(".java")){
                //Получаем объекты типа Class
                final Class c = Class.forName(basePackage + fileList[i].getName().replace(".java",""));
                System.out.println("class = " + c.getName());
                Constructor defaultConstructor = c.getDeclaredConstructor();
                //Создаем объект
                Object obj  = defaultConstructor.newInstance();
                //Получаем поля
                Field[] fields = c.getDeclaredFields();
                //пробегаемся по полям и находим поля с аннотацией и устанавливаем значения
                for (Field field : fields){
                    //Объект класса Class об аннотации
                    final RandomInt annotation = field.getAnnotation(RandomInt.class);
                    //нужно проверить что вернулось
                    if (annotation != null) {
                        //Задать рандомное значение от мин до макс и присвоить field
                        int random = new Random().nextInt(annotation.max() - annotation.min()) + annotation.min();
                        //Установить значение в поле
                        field.setAccessible(true);
                        field.set(obj, random);
                    }
                }
                    //Добавляем в массив
//                for (int j = 0; j < instanceObj.length; j++) {
                    instanceObj[arrayCounter++] = obj;
//                }
            } }
        return instanceObj;
    }
}
