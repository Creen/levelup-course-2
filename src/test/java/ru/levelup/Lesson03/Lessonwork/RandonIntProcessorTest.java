package ru.levelup.Lesson03.Lessonwork;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

public class RandonIntProcessorTest {

    private RandomIntProcessor processor;
    //1. Запускается в самом начале
    //2. Запускается только раз
    //если JUnits - @BeforeClass
    @BeforeAll
    public static void once(){
        System.out.println("Before all");
    }

    @BeforeEach
    //1. Запускается перед каждым тестом (тестовый метод)
    public void setup(){
        this.processor = new RandomIntProcessor();
        System.out.println("Setap");
    }


    @RepeatedTest(100)
    public void testNonStaticProcessor() throws IllegalAccessException {
        Person person = new Person();
        processor.nonStaticProcess(person);

        int age = person.getAge();
        Assertions.assertTrue(age >= 1 && age < 43);
    }

    @Test

    public void testNonStaticProcessor_ObjectNull() throws IllegalAccessException{
        Assertions.assertThrows(
                NullPointerException.class,
                new Executable() {
                    @Override
                    public void execute() throws Throwable {
                        processor.nonStaticProcess(null);
                    }
                }
        );

    }

    //Запускается после выполения теста (после отработки метода)
    @AfterEach
    public void tearDown(){
        System.out.println("Tear down");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }
}
