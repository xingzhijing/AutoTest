package com.xzj.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void test1(){
        System.out.printf("Thread1 : %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread2 : %s%n", Thread.currentThread().getId());
    }


    @Test
    public void testCase1(){
        System.out.println("第一次试试TesNG框架！");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod 在测试方法之前运行！");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("BeforeMethod 在测试方法之后运行！");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass 在类之前运行此方法！");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass 在类之后运行此方法！");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite 类之前运行此套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite 类之后运行此套件");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest 运行！");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest 运行！");
    }
}