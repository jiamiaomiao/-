package com.tester.extent.demo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {

    @Test
    public void test1()
    {

        Assert.assertEquals(1,2);

    }


    @Test
    public void test2()
    {
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3()
    {
        Assert.assertEquals("aaa","bbb");
    }

    @Test(timeOut = 2000)
    public void logDemo()
    {
        Reporter.log("这是我自己写的日志");

    }
}
