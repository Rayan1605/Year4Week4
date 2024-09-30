package com.example.year4week3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //This is to enable feign clients
public class Year4Week3Application {

    public static void main(String[] args) {
        SpringApplication.run(Year4Week3Application.class, args);
    }

}
