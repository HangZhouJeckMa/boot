package com.jxd.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

/**
 * @Author:WWW
 * @Date:2021/9/24 0024
 */
@Controller
@ConfigurationProperties(prefix = "student")
public class ConfigController {

    //获得对象的属性值
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
