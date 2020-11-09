package com.junit.suite;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

// @SelectPackages 选择需要执行的测试包
// @IncludePackages 只执行选中的测试包  需要与@SelectPackages配合使用
// @ExcludePackages过滤掉所选择的测试包
@RunWith(JUnitPlatform.class)
@SelectPackages({
        "com.junit5.test2",
        "com.junit5.test"
})
@IncludePackages({
        "com.junit5.test2"
})
@ExcludePackages({
        "com.junit5.test2"
})
public class SuiteTest {
}
