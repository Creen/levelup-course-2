package ru.levelup.lesson03.lessonwork;

public class StringUtil {
    //Стркока пустая если она
    //null
    //""
    //("            ")
    public static boolean isEmpty(String value){
        //"  dff " -> "dff"
        //" as as " -> "as as"
        return value == null || value.trim().isEmpty();//trim() убирает пробелы в начале и конце

    }

}
