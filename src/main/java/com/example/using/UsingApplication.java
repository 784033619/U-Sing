package com.example.using;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.using.dao")
@SpringBootApplication
public class UsingApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsingApplication.class, args);
    }
}
