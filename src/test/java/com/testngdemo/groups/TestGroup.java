package com.testngdemo.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroup {


//    @BeforeGroups("selenium-test")
//    public void setupSelenium() {
//        System.out.println("BeforeGroups-selenium-test");
//    }
//
//    @AfterGroups("selenium-test")
//    public void cleanSelenium() {
//        System.out.println("AfterGroups-selenium-test");
//    }
    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }



//    @Test(groups = "selenium-test")
//    public void runSelenium() {
//        System.out.println("runSelenium()");
//    }
//
//    @Test(groups = "selenium-test")
//    public void runSelenium1() {
//        System.out.println("runSelenium()1");
//    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }

    @Test(groups = "database")
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(dependsOnGroups = { "database", "selenium-test" })
    public void runFinal() {
        System.out.println("runFinal");
    }

    @Test(groups = {"selenium-test" ,"database"})
    public  void groupShared(){
        System.out.println("groupShared");
    }

}