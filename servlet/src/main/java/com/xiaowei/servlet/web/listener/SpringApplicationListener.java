package com.xiaowei.servlet.web.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName SpringApplicationListener
 * @Desciption SpringApplication 运行前准备环节 Listener
 * @Author weizheng
 * @Date 2019/8/20 10:43
 **/
public class SpringApplicationListener implements SpringApplicationRunListener {

    public SpringApplicationListener(SpringApplication application, String[] args) {}

    @Override
    public void starting() {
        System.out.println("---------------------------- SpringApplicationListener starting ------------------------");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {

    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
