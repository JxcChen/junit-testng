package com.testng.test;

import com.junit.test.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {


    @Test
    @Parameters({"num1","num2"})
    public void subTest(int num1,int num2){
        int subResult = Calculator.sub(num1, num2);
        System.out.println(subResult);
    }

    @Test
    @Parameters({"num1","num2"})
    public void multiplyTest(int num1,int num2){
        int mulResult = Calculator.multiply(num1, num2);
        System.out.println(mulResult);
    }
}
