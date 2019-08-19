package com.xiaowei.autoconfiguration.bootstrap;

import com.xiaowei.autoconfiguration.service.Calculation;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName CalculationBootstrap
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 11:03
 **/
@ComponentScan(basePackages = "com.xiaowei.autoconfiguration.service")
public class CalculationBootstrap {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculationBootstrap.class)
                .web(WebApplicationType.NONE)
                .profiles("java8")
                .run(args);
        Calculation calculation = context.getBean(Calculation.class);
        System.out.println("calculate res = " + calculation.sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    }
}
