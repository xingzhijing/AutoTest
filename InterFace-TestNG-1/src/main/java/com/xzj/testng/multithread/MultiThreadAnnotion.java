package com.xzj.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadAnnotion {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void test(){
        System.out.printf("Thread : %s%n", Thread.currentThread().getId());
    }
}
