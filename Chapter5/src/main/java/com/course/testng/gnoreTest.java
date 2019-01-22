package com.course.testng;

import org.testng.annotations.Test;

public class gnoreTest {

    @Test
    public  void Ignore1()
    {
        System.out.println("Ignore1 执行");
    }

    //忽略测试  当enabled=false
    @Test(enabled = false)
    public  void Ignore2()
    {
        System.out.println("Ignore2 执行");
    }

    @Test(enabled = true)
    public  void Ignore3()
    {
        System.out.println("Ignore3 执行");
    }
}
