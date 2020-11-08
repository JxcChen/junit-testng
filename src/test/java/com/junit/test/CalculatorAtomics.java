package com.junit.test;

import java.util.concurrent.atomic.AtomicInteger;

public class CalculatorAtomics {
    public static AtomicInteger result = new AtomicInteger();
    /**
     * 加法
     * @param a 数字a
     * @param b 数字b
     * @return a+b
     */
    public static int add(int a,int b){
        result.set(a + b);
        return result.get();
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return a-b
     */
    public static int sub(int a,int b){
        result.set(a - b);
        return result.get();
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return a*b
     */
    public static int multiply(int a,int b){
        result.set(a * b);
        return result.get();
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return a/b
     */
    public static int divide(int a,int b){
        result.set(a / b);
        return result.get();
    }

    /**
     * 累加器  只使用AtomicInteger 还是有存在错误结果
     * @param a 累加值
     * @return 累加和
     */
    public synchronized static int accumulator(int a) throws InterruptedException {
        Thread.sleep(2000);
        return result.addAndGet(a);
    }


    /**
     * 将结果清零
     */
    public static void resetResult(){
        result.set(0);
        result.get();
        System.out.println(System.currentTimeMillis()+"将结果清零");
    }
}
