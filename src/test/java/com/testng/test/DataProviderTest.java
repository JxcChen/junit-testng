package com.testng.test;

import com.junit.test.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void subTest(int num1, int num2){
        int subResult = Calculator.sub(num1, num2);
        System.out.println(subResult);
    }

    @DataProvider(name = "data")
    public static Object[][] subData(){
        Object[][] data = {
                {3,4},
                {6,2},
                {9,1}
        };
        return data;
    }
}
