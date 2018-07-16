package com.autoconfigure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration // This will auto config the class for you and you do not need to do this manually
@ComponentScan // Remember this is your main configuration for the file. and you only need it once.
public class AutoConfigureApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoConfigureApplication.class, args);
    }
}
