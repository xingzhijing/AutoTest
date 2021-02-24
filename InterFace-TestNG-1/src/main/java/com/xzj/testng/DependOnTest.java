package com.xzj.testng;

import org.testng.annotations.Test;

public class DependOnTest {

    @Test
    public void test1(){
        System.out.println("test1  执行！！！");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 依赖test1 执行  即：test1成功，执行test2；否则test2 不执行。");
    }
}
