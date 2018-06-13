package com.testngdemo.SpringIntegration;

import org.springframework.stereotype.Service;

@Service
public class RandomEmailGenerator implements EmailGenerator {

    public String generate() {
        return "example@126.com";
    }
}