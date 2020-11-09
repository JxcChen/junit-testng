package com.testng.test;

import com.junit.test.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

// 多场景并发混合
public class MixConcurrentTest {

    @Test(threadPoolSize = 4,invocationCount = 4,timeOut = 10000)
    public void subTest() throws InterruptedException {
        int subResult = Calculator.sub(4, 2);
        Assert.assertEquals(subResult,2);
    }

    @Test(threadPoolSize = 4,invocationCount = 8,timeOut = 10000)
    public void divideTest() throws InterruptedException {
        int divideResult = Calculator.divide(8, 2);
        Assert.assertEquals(divideResult,4);
    }

}
