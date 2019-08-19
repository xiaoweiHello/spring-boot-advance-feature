package com.xiaowei.springapplication.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

/**
 * @ClassName AfterHelloWorldApplicationContextInitializer
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 15:53
 **/
public class AfterHelloWorldApplicationContextInitializer<C extends ConfigurableApplicationContext> implements ApplicationContextInitializer<C>, Ordered {

    @Override
    public void initialize(C applicationContext) {
        System.out.println("AfterHelloWorldApplicationContextInitializer start ...");
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
