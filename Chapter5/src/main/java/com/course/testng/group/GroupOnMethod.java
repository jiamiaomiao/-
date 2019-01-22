package com.course.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.security.acl.Group;

public class GroupOnMethod {

      @Test(groups="server")
     public  void test1()
     {
         System.out.println("这是服务端测试1");

     }

    @Test(groups="server")
    public  void test2()
    {
        System.out.println("这是服务端测试2");

    }

    @Test(groups="client")
    public  void test3()
    {
        System.out.println("这是客户端测试3");
    }

    @Test(groups="client")
    public  void test4()
    {
        System.out.println("这是客户端测试4");
    }
    @BeforeGroups("server")
    public void beforeGroupOnServer()
    {
        System.out.println("这是服务端组之前运行的方法");
    }

    @AfterGroups("server")
    public void afterGroupOnServer()
    {
        System.out.println("这是服务端组之后运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupOnClient()
    {
        System.out.println("这是客户端组之前运行的方法");
    }

    @AfterGroups("client")
    public void afterGroupOnClient()
    {
        System.out.println("这是客户端组之后运行的方法");
    }
}
