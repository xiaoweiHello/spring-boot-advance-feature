package com.xiaowei.autoconfiguration.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloWorldConfiguration
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/16 18:08
 **/
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld() {
        return "Hello World 2019!";
    }
}
