package com.xzj.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
    @Test
    @Parameters({"name", "age"})
    public void userInfo(String name, String age){
        System.out.println("name=" + name + "; age=" + age);
    }
}
