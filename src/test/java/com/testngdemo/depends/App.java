package com.testngdemo.depends;


import org.testng.annotations.Test;

public class App {

    @Test
    public void method1() {
        System.out.println("This is method 1");
//        throw new Exception();
    }

    @Test(dependsOnMethods = { "method1" })
    public void method2() {
        System.out.println("This is method 2");
    }

}