package com.xzj.testng;

import org.testng.annotations.Test;

public class TimeOutTest {
    //测试成功
    @Test(timeOut = 2000)
    public void test1() throws InterruptedException {
        Thread.sleep(1000);
    }

    //测试失败
    @Test(timeOut = 2000)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
    }
}
