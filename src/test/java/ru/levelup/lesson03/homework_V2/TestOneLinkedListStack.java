package ru.levelup.lesson03.homework_V2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOneLinkedListStack {

    @Test
    public void testPushPopInt(){
        OneLinkedListStack<Integer> oneLinkedListStack = new OneLinkedListStack<>();
        oneLinkedListStack.push(1);
        oneLinkedListStack.push(2);
        oneLinkedListStack.push(3);
        Assertions.assertEquals(3, (int)oneLinkedListStack.pop());
        oneLinkedListStack.pop();
        Assertions.assertEquals(1, (int)oneLinkedListStack.pop());
    }
    @Test
    public void testPushPeepInt(){
        OneLinkedListStack<Integer> oneLinkedListStack = new OneLinkedListStack<>();
        oneLinkedListStack.push(1);
        oneLinkedListStack.push(2);
        oneLinkedListStack.push(3);
        Assertions.assertEquals(3, (int)oneLinkedListStack.peek());
    }

}
