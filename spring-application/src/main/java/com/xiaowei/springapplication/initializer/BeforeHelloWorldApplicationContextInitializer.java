package com.xiaowei.springapplication.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * @ClassName BeforeHelloWorldApplicationContextInitializer
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 15:53
 **/
@Order(Ordered.HIGHEST_PRECEDENCE)
public class BeforeHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C> {

    @Override
    public void initialize(C applicationContext) {
        System.out.println("BeforeHelloWorldApplicationContextInitializer start ...");
    }
}
