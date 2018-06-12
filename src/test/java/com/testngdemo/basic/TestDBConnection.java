package com.testngdemo.basic;

import org.testng.annotations.*;

public class TestDBConnection {


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite-TestDBConnection");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite-TestDBConnection");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest-TestDBConnection");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest-TestDBConnection");
    }

    @Test
    public void runOtherTest1() {
        System.out.println("@Test - runOtherTest1");
    }

    @Test
    public void runOtherTest2() {
        System.out.println("@Test - runOtherTest2");
    }
    @BeforeClass
    public void BeforeClass() {
        System.out.println("@BeforeClass-TestDBConnection");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("@AfterClass-TestDBConnection");
    }



}
