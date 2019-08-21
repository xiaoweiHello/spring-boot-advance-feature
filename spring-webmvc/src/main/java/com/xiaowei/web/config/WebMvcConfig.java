package com.xiaowei.web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName WebMvcConfig
 * @Desciption 使用注解的方式替代 Mvc 的配置(app-context.xml的消失)
 * @Author weizheng
 * @Date 2019/8/20 16:30
 **/
@Configuration
@EnableWebMvc           // 自动装配 app-context.xml 中的组件
                        // 该注解在springBoot自动装配中 WebMvcAutoConfiguration 上的
                        // @ConditionalOnMissingBean(WebMvcConfigurationSupport.class) 相互冲突,存在@EnableWebMvc就不会使用 WebMvcAutoConfiguration 类进行自动装配
public class WebMvcConfig implements WebMvcConfigurer {

//    <!--<bean id="viewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">-->
//        <!--<property name="viewClass" value="org.springframework.web.servlet.view.JstlView"/>-->
//        <!--<property name="prefix" value="/WEB-INF/jsp/"/>-->
//        <!--<property name="suffix" value=".jsp"/>-->
//    <!--</bean>-->

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中................");
                return true;
            }
        });
    }
}
