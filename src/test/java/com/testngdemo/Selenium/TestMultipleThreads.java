package com.testngdemo.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestMultipleThreads {

    @Test(invocationCount = 3)
    public void loadTestThisWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com" );

        System.out.println("Page Title is " + driver.getTitle());
        AssertJUnit.assertEquals("Google", driver.getTitle());
        driver.quit();

    }
}
