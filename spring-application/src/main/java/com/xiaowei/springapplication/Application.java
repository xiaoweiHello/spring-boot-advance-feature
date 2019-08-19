package com.xiaowei.springapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	    // 方法一
//		SpringApplication.run(Application.class, args);

		// 方法二
//        new SpringApplication(Application.class)
//                .run(args);
        // 或者
        /**
         * 配置 Bean 源
         *      1. 类的全路径
         *      2. 包名
         *      3. xml文件路径
         */
        Set<String> sources = new HashSet<>();
        sources.add(StarterApplicationClass.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.setWebApplicationType(WebApplicationType.NONE);
        springApplication.run(args);

        // 方法三
//        new SpringApplicationBuilder(Application.class)
//                .run(args);
	}


	@SpringBootApplication
	public class StarterApplicationClass{
    }
}
