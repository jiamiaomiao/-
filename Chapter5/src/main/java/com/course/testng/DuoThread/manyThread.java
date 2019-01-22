package com.course.testng.DuoThread;

import org.testng.annotations.Test;

public class manyThread {

    @Test
    public  void test1()
    {
        System.out.printf("Thread id: %s%n",Thread.currentThread());
    }
    @Test
    public  void test2()
    {
        System.out.printf("Thread id: %s%n",Thread.currentThread());
    }
    @Test
    public  void test3()
    {
        System.out.printf("Thread id: %s%n",Thread.currentThread());
    }
}
