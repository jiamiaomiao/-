package com.course.testng.group;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupOnClass3 {

    public void teacher1()
    {
        System.out.println("groupOnClass3333中的teacher1运行");

    }

    public void teacher2()
    {
        System.out.println("groupOnClass3333中的teacher2运行");

    }



}
