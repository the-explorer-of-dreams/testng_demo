package com.testngdemo.basic;

import com.testngdemo.SpringIntegration.RandomEmailGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelloWorld {
    @Test
    public void testEmailGenerator(){
        RandomEmailGenerator randomEmailGenerator = new RandomEmailGenerator();
        String email = randomEmailGenerator.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email,"testng_demo@126.com");
        System.out.println("@Test-TestHelloWorld");
    }
}
