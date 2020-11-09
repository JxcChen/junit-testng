package com.junit.suite;


import com.junit.test.CalculatorTest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

// @SelectClasses选中需要执行的测试类
@RunWith(JUnitPlatform.class)
@SelectClasses({
        CalculatorTest.class,
        Junit5Test.class
})
public class SuiteTest02 {
}
