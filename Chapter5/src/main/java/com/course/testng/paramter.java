package com.course.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class paramter {

    @Test
    @Parameters({"name","age"})
    public void parameter(String name ,int age)
    {
        System.out.println("name="+name +" ,age = "+age);
    }
}
