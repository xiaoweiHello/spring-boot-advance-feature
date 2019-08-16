package com.xiaowei.servlet.configuration;

import com.xiaowei.servlet.web.servlet.BeanServletDemo;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.Servlet;

/**
 * @ClassName Config
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/16 14:25
 **/
@Component
public class Config {

    @Bean
    public ServletRegistrationBean beanServletDemo() {
        ServletRegistrationBean<Servlet> registrationBean = new ServletRegistrationBean<>();
        // 创建servlet
        BeanServletDemo beanServletDemo = new BeanServletDemo();
        // 注册servlet
        registrationBean.setServlet(beanServletDemo);
        // 设置名称
        registrationBean.setName("beanServletDemo");
        // 设置配置规则
        registrationBean.addUrlMappings("/bean/servlet");
        // 设置加载参数
        registrationBean.setLoadOnStartup(1);
        return registrationBean;
    }
}
