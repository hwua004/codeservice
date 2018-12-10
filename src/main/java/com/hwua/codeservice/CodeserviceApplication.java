package com.hwua.codeservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hwua.codeservice.dao")
public class CodeserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeserviceApplication.class, args);
    }
}
