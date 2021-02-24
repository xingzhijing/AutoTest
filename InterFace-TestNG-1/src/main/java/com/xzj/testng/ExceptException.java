package com.xzj.testng;

import org.testng.annotations.Test;

public class ExceptException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaild(){
        System.out.println("这是一个失败的异常测试！");
    }

    //期望出现的异常测试与抛出的异常相同，所以是成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试！");
        throw new RuntimeException();
    }
}
