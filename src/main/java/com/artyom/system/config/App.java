package com.artyom.system.config;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = "com.artyom.system.*")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
