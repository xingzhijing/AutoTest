package com.xzj.testng.multithread;

import org.testng.annotations.Test;

public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread : %s%n", Thread.currentThread().getId());
    }

}
