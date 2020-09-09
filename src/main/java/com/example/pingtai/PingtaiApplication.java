package com.example.pingtai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.pingtai.mapper")
public class PingtaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PingtaiApplication.class, args);
    }

}
