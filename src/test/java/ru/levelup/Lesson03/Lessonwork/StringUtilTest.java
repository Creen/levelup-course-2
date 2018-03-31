package ru.levelup.Lesson03.Lessonwork;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    //testIsEmpty_nullString_returnTrue()
    @Test
    public void testIsEmpty_nullString_returnTrue (){
        boolean result = StringUtil.isEmpty(null);
        Assertions.assertTrue(result);

    }

}
