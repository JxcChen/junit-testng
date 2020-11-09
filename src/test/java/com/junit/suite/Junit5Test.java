package com.junit.suite;

import org.junit.jupiter.api.*;

public class Junit5Test {


    // @BeforeAll : 在测试类执行之前执行的方法 相当与testng中的@BeforeClass
    @BeforeAll
    public static void beforeAll(){
        System.out.println("beforeAll");
    }

    // @BeforeAll : 在每个测试用例前执行的方法 相当于testng的@BeforeMethod
    @BeforeEach
    public void beforeEach(){
        System.out.println("beforeEach");
    }

    // @Disabled 相当但junit4的Ignore 跳过该测试用例
    @Test
    @Disabled
    void test01(){
        System.out.println("test01");
    }

    // @RepeatedTest 重复执行
    @RepeatedTest(4)
    @Tag("tagDemo")
    void test02(){
        System.out.println("test02");
    }
    // @DisplayName("name") 展示用例名
    @Test
    @Tag("tagDemo2")
    @DisplayName("测试用例3")
    void test03(){
        System.out.println("test03");
    }

    // @AfterEach : 在测试类执行之后执行的方法
    @AfterEach
    public void afterEach(){
        System.out.println("afterEach");
    }

    // @AfterAll : 在每个测试用例后执行的方法
    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll");
    }

}
