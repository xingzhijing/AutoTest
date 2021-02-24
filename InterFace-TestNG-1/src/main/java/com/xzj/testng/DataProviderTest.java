package com.xzj.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "test")
    public void dataTest1(String name, String age){
        System.out.println("name : " + name + ", age : " + age);
    }

    @DataProvider(name = "test")
    public Object[][] dataProviderTest(){
        Object[][] result= new Object[][]{
                {"张三", "11"},
                {"李四", "12"},
                {"王五", "13"}
        };
        return result;
    }

    @Test(dataProvider = "dataTest")
    public void dataTest2(String name, String age){
        System.out.println("dataTest2方法：name : " + name + ", age : " + age);
    }

    @Test(dataProvider = "dataTest")
    public void dataTest3(String name, String age){
        System.out.println("dataTest3方法：name : " + name + ", age : " + age);
    }

    @DataProvider(name = "dataTest")
    public Object[][] dataProviderTest1(Method method){
        Object[][] result= null;
        if (method.getName().equals("dataTest2")){
            result = new Object[][]{
                    {"张三", "21"},
                    {"李四", "22"}
            };
        }
        else{
            result = new Object[][]{
                {"王五", "33"},
                {"赵六", "34"}
            };
        }

        return result;
    }
}
