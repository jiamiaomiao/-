package com.course.testng;

import org.testng.annotations.Test;

public class DenpendTest {

    @Test
    public void test1()
    {
        System.out.println("test1 run");
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2()
    {
        System.out.println("test2 run");
    }
}
