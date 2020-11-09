package com.junit.suite;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeClassNamePatterns;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

// @SelectPackages选中需要执行的测试包
// @IncludeClassNamePatterns 只执行测试包中对应的测试类 与@SelectPackages配合使用
// @ExcludeClassNamePatterns 过滤掉测试包中的测试类
@RunWith(JUnitPlatform.class)
@SelectPackages({
        "com.junit.suite",
        "com.junit.test"
})
@IncludeClassNamePatterns({
        "com.junit.suite.Junit5Test",
        "com.junit.test.CalculatorTest"
})
@ExcludeClassNamePatterns({
        "com.junit.test.CalculatorTest"
})
public class SuiteTest03 {
}
