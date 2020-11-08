package com.junit.test;


import org.junit.jupiter.api.*;

public class JunitFixturesTest {
    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll注解方法");
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach注解方法");
    }

    @Test
    @Order(2)
    public void test01() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test01方法");
    }

    @Test
    @Order(1)
    public void test02() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("test02方法");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach注解方法");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll注解方法");
    }
}
