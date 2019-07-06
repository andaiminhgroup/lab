package com.imooc.junit;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("after all");
    }

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(1, 3));
    }

    @Test
    public void testAdd2(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(4, calculator.add(1, 3));
    }

    @Ignore
    public void testIgnore(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(5, calculator.add(1, 3));
    }
}
