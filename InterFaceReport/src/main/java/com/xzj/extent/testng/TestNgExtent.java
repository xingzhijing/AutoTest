package com.xzj.extent.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgExtent {

    @Test
    public void test1(){
        Assert.assertEquals("1", "1", "1等于1");
    }

    @Test
    public void test2(){
        Assert.assertEquals(3, 2);
    }

    @Test
    public void test3(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是小邢写的日志");
        throw new RuntimeException("这是小邢自己抛的异常");
    }

}
