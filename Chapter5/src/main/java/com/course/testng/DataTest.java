package com.course.testng;

import com.beust.jcommander.Parameter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataTest {

    @Test(dataProvider = "jia")
    public void test(String name ,int age)
    {
        System.out.println("name="+name +" ,age = "+age);

    }

    @DataProvider(name="jia")
    public Object[] []  pro()
    {
        Object[] []ob=new Object[][]{
            {"zhangsan",10},
            {"wangwu",2},
            {"maliu",16}

        };
        return ob;

    }



    @DataProvider(name="methodData")
    public Object[] []  pro1(Method method)
    {
        Object[] []ob=null;
        if(method.getName().equals("test1"))
        {
            ob=new Object[][]
                    {
                            {"jiamiaomiao",28},
                            {"hushanshan",78}
                    };

        }
        else if(method.getName().equals("test2"))
        {
            ob=new Object[][]
                    {
                            {"qqqqqqqqq",67},
                            {"wwwwwww",34}
                    };

        }
        return ob;

        };




        @Test(dataProvider = "methodData")
        public void test1(String name ,int age)
        {
            System.out.println("test1——name="+name +" ,age = "+age);

        }

        @Test(dataProvider = "methodData")
        public void test2(String name ,int age)
        {
            System.out.println("test2——name="+name +" ,age = "+age);

        }



}
