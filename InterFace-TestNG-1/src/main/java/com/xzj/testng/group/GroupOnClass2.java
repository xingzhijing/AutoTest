package com.xzj.testng.group;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupOnClass2 {

    public void sut1(){
        System.out.println("这是Class2中的stu1方法！");
    }

    public void sut2(){
        System.out.println("这是Class2中的stu2方法！");
        //throw new RuntimeException();
    }
}
