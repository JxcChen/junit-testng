package com.junit.test;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MixConcurrenceTest {
    @RepeatedTest(10)
    @Test
    void addTest() throws InterruptedException {
        int addResult01 = Calculator.synAdd(4, 5);
        assertEquals(9,addResult01);

    }
    @RepeatedTest(10)
    void subTest() throws InterruptedException {
        int subResult = Calculator.synSub(6, 5);
        assertEquals(1,subResult);
        System.out.println(subResult);
    }
}
