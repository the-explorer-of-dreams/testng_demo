package com.testngdemo.groups;

import org.testng.annotations.Test;

@Test(groups = "selenium-test")
public class TestSelenium {
    public void runSelenium() {
        System.out.println("runSelenium()");
    }

    public void runSelenium1() {
        System.out.println("runSelenium1()");
    }

    @Test(groups = "database")
    public void testConnectOracle1() {
        System.out.println("TestSelenium-testConnectOracle()-database");
    }

    @Test(groups = "database")
    public void testConnectMsSQL1() {
        System.out.println("TestSelenium-testConnectMsSQL-database");
    }
}
