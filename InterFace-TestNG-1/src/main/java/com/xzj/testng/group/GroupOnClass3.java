package com.xzj.testng.group;

import org.testng.annotations.Test;

//@Test(groups = "teacher", dependsOnGroups = {"stu"})
@Test(groups = "teacher")
public class GroupOnClass3 {

    public void teacher1(){
        System.out.println("这是Class3中的teacher1方法！");
    }

    public void teacher2(){
        System.out.println("这是Class3中的teacher2方法！");
    }
}
