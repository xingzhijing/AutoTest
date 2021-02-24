package com.xzj.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass1 {

    public void sut1(){
        System.out.println("这是Class1中的stu1方法！");
    }

    public void sut2(){
        System.out.println("这是Class1中的stu2方法！");
    }
}
