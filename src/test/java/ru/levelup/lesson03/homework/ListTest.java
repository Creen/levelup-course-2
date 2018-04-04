package ru.levelup.lesson03.homework;

import org.junit.jupiter.api.*;

public class ListTest {

    private OneLinkedList list;

    @BeforeAll
    public static void once(){
        System.out.println("Before All");
    }

    @BeforeEach
    public void setup(){
        this.list = new OneLinkedList();
        System.out.println("Setup");
    }

    @Test
//    public void popIsEmptyTest(){
//        OneLinkedList<String> stack = new OneLinkedList();
//        Assertions.assertTrue(stack.pop());
//        stack.pop();
//
//    }

    @AfterEach
    public void tearDown(){
        System.out.println("Tear down");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }
}
