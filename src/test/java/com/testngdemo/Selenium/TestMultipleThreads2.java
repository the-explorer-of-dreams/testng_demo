package com.testngdemo.Selenium;


import org.testng.annotations.Test;

public class TestMultipleThreads2 {

    @Test(invocationCount = 100, threadPoolSize = 3)
    public void testThreadPools() {

        System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());

    }
}
