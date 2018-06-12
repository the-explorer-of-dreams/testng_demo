package com.testngdemo.basic;

import org.testng.annotations.*;

public class DBConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite-XDBConfig");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite-XDBConfig");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest-XDBConfig");
    }

    @AfterTest()
    public void afterTest() {
        System.out.println("@AfterTest-XDBConfig");
    }

    @Test
    public void dbConfigTest(){
        System.out.println("@Test-DBConfig");
    }


}
