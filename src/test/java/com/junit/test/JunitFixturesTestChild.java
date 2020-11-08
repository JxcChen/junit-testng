package com.junit.test;


import org.junit.jupiter.api.*;

public class JunitFixturesTestChild extends JunitFixturesTest {
    @BeforeAll
    public static void beforeAllChild(){
        System.out.println("BeforeAllChild注解方法");
    }
    @BeforeEach
    public void beforeEachChild(){
        System.out.println("beforeEachChild注解方法");
    }

    @Test
    @Order(2)
    public void test01Child() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test01Child方法");
    }

    @Test
    @Order(1)
    public void test02() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test02Child方法");
    }

    @AfterEach
    public void afterEachChild(){
        System.out.println("AfterChildEach注解方法");
    }
    @AfterAll
    public static void afterAllChild(){
        System.out.println("AfterChildAll注解方法");
    }
}
