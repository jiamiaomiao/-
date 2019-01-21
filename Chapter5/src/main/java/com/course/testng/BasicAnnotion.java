package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotion {

     //最基本的测试
    @Test
     public void   testCase1()
    {
     System.out.println("这是测试1");

    }
    @Test
    public void testCase2()
    {
     System.out.println("这是测试2");

    }

    @BeforeMethod
    public void beforeMethod()
    {
     System.out.println("beforeMethod 这是在测试方法之前运行的");
    }


    @AfterMethod
    public void afterMethod()
    {
     System.out.println("afterMethod 这是在测试方法之后运行的");
    }
    @BeforeClass
    public void beforeClass()
    {
     System.out.println("beforeClass这是在类之前运行的方法");
    }
    @AfterClass
    public void afterClass()
    {
     System.out.println("afterClass这是在类之后运行的方法");
    }

    @BeforeSuite
    public  void beforeSuit()
    {
     System.out.println("beforeSuit 测试套件");
    }

    @AfterSuite
    public  void afterSuit()
    {
     System.out.println("afterSuit 测试套件");

    }

}
