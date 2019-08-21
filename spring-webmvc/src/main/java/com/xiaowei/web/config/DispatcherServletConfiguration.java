package com.xiaowei.web.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName DispatcherServletConfiguration
 * @Desciption 使用注解的方式替代整个 web 项目的配置(web.xml消失的原因)
 * @Author weizheng
 * @Date 2019/8/21 10:53
 **/
@ComponentScan(basePackages = "com.xiaowei.web")
public class DispatcherServletConfiguration {
}
