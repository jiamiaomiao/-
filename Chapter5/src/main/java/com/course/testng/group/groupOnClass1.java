package com.course.testng.group;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupOnClass1 {


    public void stu1()
    {
        System.out.println("groupOnClass1中的stu1运行");

    }

    public void stu2()
    {
        System.out.println("groupOnClass1中的stu2222运行");

    }
}
