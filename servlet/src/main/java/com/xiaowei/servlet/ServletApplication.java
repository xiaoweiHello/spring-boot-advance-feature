package com.xiaowei.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.xiaowei.servlet.web.servlet")
public class ServletApplication {

	public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(ServletApplication.class)
//                .web(WebApplicationType.NONE)
                .run(args);
//		SpringApplication.run(ServletApplication.class, args);
	}

}
