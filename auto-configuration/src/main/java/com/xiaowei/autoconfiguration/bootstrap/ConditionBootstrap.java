package com.xiaowei.autoconfiguration.bootstrap;

import com.xiaowei.autoconfiguration.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName ConditionBootstrap
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 11:37
 **/
public class ConditionBootstrap {

    @Bean
    @ConditionOnSystemProperty(name = "user.name", value = "xiaowei")
    public String helloWorld() {
        return "Hello World xiaowei";
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("hello World Bean = " + helloWorld);
        context.close();
    }
}
