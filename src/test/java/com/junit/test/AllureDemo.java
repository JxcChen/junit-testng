package com.junit.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllureDemo {


    /**
     * 每次执行用例前进行清零操作
     */
   /* @BeforeEach
    public void reset(){
        // 执行清零操作
        Calculator.resetResult();
    }*/


    @Test
    void addTest(){
        int addResult01 = Calculator.add(4, 5);
        int addResult02 = Calculator.add(4, 5);
        int addResult03 = Calculator.add(6, 4);
        assertAll(
                ()->assertEquals(9,addResult01),
                ()->assertEquals(7,addResult02),
                ()->assertEquals(10,addResult03)
        );

    }

    @Test
    void subTest(){
        int subResult = Calculator.sub(6, 5);
        assertEquals(1,subResult);
        System.out.println(subResult);
    }

    @Test
    void multiplyTest(){
        int multiplyResult = Calculator.multiply(4, 5);
        assertEquals(20,multiplyResult);
    }

    @Test
    @Order(1)
    void divideTest(){
        int divideResult = Calculator.divide(8, 2);
        assertEquals(4,divideResult);
    }



    @RepeatedTest(5)
    void  accumulatorTest() throws InterruptedException {
        Calculator.result = 0;
        Calculator.accumulator( 4);
        Calculator.accumulator( 4);
        int accumulateResult = Calculator.accumulator( 4);
        assertEquals(12,accumulateResult);
    }


    /**
     * 在每次用例执行完后执行清零操作
     * 因为在多线程执行时，第一二个线程会同时执行BeforeEach清零操作 导致最后一个用例执行时result不为零，最后断言出错
     * 所以在用例执行后也加上清零操作
     */
    @AfterEach
    public void resetAg(){
        Calculator.resetResult();
    }
}
