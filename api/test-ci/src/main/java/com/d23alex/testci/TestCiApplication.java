package com.d23alex.testci;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class TestCiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCiApplication.class, args);
    }

}
