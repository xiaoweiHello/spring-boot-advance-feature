package com.xiaowei.autoconfiguration.bootstrap;

import com.xiaowei.autoconfiguration.annotation.EnableHelloWorld;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName HelloWorldBootStrap
 * @Desciption HelloWorld启动类
 * @Author weizheng
 * @Date 2019/8/16 18:11
 **/
//@ComponentScan(basePackages = "com.xiaowei.autoconfiguration.configuration")      // 通过扫描包的形式导入通过被 @Component 及其扩展注解（如：@Service 等）标注的类，springBoot 的 @SpringBootApplication 同样通过该注解实现
    @EnableHelloWorld       // 自动导入 HelloWorld 的配置类，其具体实现依赖于 @Import 注解，@SpringBootApplication 同样通过该注解实现
public class HelloWorldBootStrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(HelloWorldBootStrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        String helloWorld = context.getBean("helloWorld", String.class);
        System.out.println("hello world Bean: " + helloWorld);
    }
}
