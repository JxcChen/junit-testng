package com.junit.suite;


import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.*;
import org.junit.runner.RunWith;

// @SelectPackages选中需要执行的测试包
// @IncludeTags 执行包含标签的用例 ，标签打在测试用例前
// @IncludeTags 过滤掉包含标签的用例
@RunWith(JUnitPlatform.class)
@SelectPackages({
        "com.junit.suite",
})
@IncludeTags({
        "tagDemo"
})
@ExcludeTags({
        "tagDemo2"
})
public class SuiteTest04 {
}
