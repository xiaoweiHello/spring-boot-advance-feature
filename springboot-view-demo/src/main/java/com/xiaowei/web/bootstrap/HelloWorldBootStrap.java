package com.xiaowei.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName HelloWorldBootStrap
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/21 17:22
 **/
@SpringBootApplication(scanBasePackages = "com.xiaowei.web")
public class HelloWorldBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldBootStrap.class, args);
    }
}
