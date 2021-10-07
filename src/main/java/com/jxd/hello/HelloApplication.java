package com.jxd.hello;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author:WWW
 * @Date:2021/9/23 0023
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.jxd")
//扫描dao接口
@MapperScan(basePackages = "com.jxd.hello.dao")

public class HelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class,args);
    }
}
