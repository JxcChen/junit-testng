package com.testng.test;

import org.testng.annotations.*;

public class TestNGFixturesTest {
    /**
     * 套件执行前
     */
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" beforeSuite");

    }

    /**
     * 在测试前执行
     */
    @BeforeTest
    public void beforeTest() {
        System.out.println(" beforeTest");
    }

    /**
     * 测试类执行前
     */
    @BeforeClass
    public void beforeClass() {
        System.out.println(" beforeClass");
    }

    /**
     * 每个测试用例前执行
     */
    @BeforeMethod
    public void beforeMethod() {
        System.out.println(" beforeMethod");
    }

    @Test
    public void test01() {
        System.out.println(" test01");
    }

    @Test
    public void test02() {
        System.out.println(" test02");
    }

    /**
     * 每个测试用例后执行
     */
    @AfterMethod
    public void afterMethod() {
        System.out.println(" afterMethod");
    }

    /**
     * 测试类执行后
     */
    @AfterClass
    public void afterClass() {
        System.out.println(" afterClass");
    }

    /**
     * 测试类执行后
     */
    @AfterTest
    public void afterTest() {
        System.out.println(" afterTest");
    }

    /**
     * 套件执行后
     */
    @AfterSuite
    public void afterSuite() {
        System.out.println(" afterSuite");
    }
}
