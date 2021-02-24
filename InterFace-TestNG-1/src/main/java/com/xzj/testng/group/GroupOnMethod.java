package com.xzj.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端 测试方法11111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端 测试方法22222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端 测试方法33333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端 测试方法44444");
    }

    @BeforeGroups("server")//groups 属性key写不写都可以
    public void beforeGroupsServer(){
        System.out.println("服务端组测试方法之前执行！！！");
    }

    @AfterGroups(groups = "server")
    public void afterGroupsServer(){
        System.out.println("服务端组测试方法之后执行！！！");
    }

    @BeforeGroups("client")//groups 属性key写不写都可以
    public void beforeGroupsClient(){
        System.out.println("服务端组测试方法之前执行！！！");
    }

    @AfterGroups(groups = "client")
    public void afterGroupsClient(){
        System.out.println("服务端组测试方法之后执行！！！");
    }
}
/*运行结果
*
服务端组测试方法之前执行！！！
这是服务端 测试方法11111
这是服务端 测试方法22222
服务端组测试方法之后执行！！！
服务端组测试方法之前执行！！！
这是客户端 测试方法33333
这是客户端 测试方法44444
服务端组测试方法之后执行！！
* */