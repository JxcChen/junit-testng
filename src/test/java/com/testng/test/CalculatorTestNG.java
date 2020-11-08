package com.testng.test;

import com.junit.test.Calculator;
import javafx.scene.layout.Priority;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;


public class CalculatorTestNG {

    /**
     * 每次执行用例前进行清零操作
     */
    @BeforeMethod
    public void reset(){
        // 执行清零操作
        Calculator.resetResult();
    }

    // priority标明执行顺序
    @Test(priority = 2)
    public void addTest(){
        // SoftAssert可以执行多个断言  并且在单个断言出错时继续往下执行
        SoftAssert assertion = new SoftAssert();
        int result1 = Calculator.add(4,5);
        assertion.assertEquals(result1,4);
        int result2 = Calculator.add(4,5);
        assertion.assertEquals(result2,5);
        int result3 = Calculator.add(4,2);
        assertion.assertEquals(result3,6);
        assertion.assertAll();



    }

    @Test(priority = 1)
    public void subTest(){
        int subResult = Calculator.sub(6, 5);
        assertEquals(1, subResult);
        System.out.println(subResult);
    }

    @Test(priority = 4)
    public void multiplyTest(){
        int multiplyResult = Calculator.multiply(4, 5);
        assertEquals(20,multiplyResult);
    }

    @Test(priority = 3)
    public void divideTest(){
        int divideResult = Calculator.divide(8, 2);
        assertEquals(4,divideResult);
    }


    // threadPoolSize 线程池中线程数 invocationCount：执行次数 timeOut：超时时间
    @Test(priority = 5,threadPoolSize = 2,invocationCount = 4,timeOut = 20000)
    public void  accumulatorTest() throws InterruptedException {
        Calculator.result = 0;
        Calculator.accumulator( 4);
        Calculator.accumulator( 4);
        int accumulateResult = Calculator.accumulator( 4);
        assertEquals(accumulateResult,12);
    }


    /**
     * 在每次用例执行完后执行清零操作
     * 因为在多线程执行时，第一二个线程会同时执行BeforeEach清零操作 导致最后一个用例执行时result不为零，最后断言出错
     * 所以在用例执行后也加上清零操作
     */
   @AfterMethod
    public void resetAg(){
        Calculator.resetResult();
    }
}
