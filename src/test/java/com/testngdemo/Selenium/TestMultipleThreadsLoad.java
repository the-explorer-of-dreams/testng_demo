package com.testngdemo.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class TestMultipleThreadsLoad {
    @Test(invocationCount = 100,threadPoolSize =20)
    public void loadTestThisWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com" );

        System.out.println("Page Title is " + driver.getTitle());
        AssertJUnit.assertEquals("百度一下，你就知道", driver.getTitle());
        driver.quit();

    }
}
