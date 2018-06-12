package com.testngdemo.expectedexception;

import org.testng.annotations.Test;

public class TestRuntime {
    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() throws Exception {
        try {
            int i = 1 / 0;
            System.out.println("After division the value of i is :"+ i);
        }catch(Exception e){
           e.printStackTrace();
           throw e;
        }

    }
}
