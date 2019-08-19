package com.xiaowei.autoconfiguration.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @ClassName HelloWorldAutoBootstrap
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 12:03
 **/
@EnableAutoConfiguration
public class HelloWorldAutoBootstrap {

    public static void main(String[] args) {
        // 传入的 class 需为导入整个项目自动配置的一个配置类（不一定为主类），所以在这里导入 HelloWorldAutoConfiguration 也是 ok 的
        /**
         * 所以 @SpringBootApplication 注解的作用为
         *      1. 通过 @SpringBootConfiguration 注解，将该注解标注为一个模板注解（将类标注为可配置类）
         *      2. 通过 @EnableAutoConfiguration 注解，配置 /META-INF/spring.factories 下的配置类
         *      3. 通过 @ComponentScan 注解，配置开发人员自主编写的 Bean
         */
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldAutoBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);
        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("helloWorld Bean = " + helloWorld);
        context.close();
    }
}
