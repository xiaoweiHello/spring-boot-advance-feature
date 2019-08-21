package com.xiaowei.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * @ClassName WebConfig
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/21 17:35
 **/
@Configuration
public class WebConfig {

    @Bean
    public InternalResourceViewResolver jspViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/templates/jsp/");
        resolver.setSuffix(".jsp");
        resolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
        return resolver;
    }
}
