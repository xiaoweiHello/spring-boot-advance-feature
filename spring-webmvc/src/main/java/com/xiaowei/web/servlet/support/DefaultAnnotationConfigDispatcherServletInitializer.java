package com.xiaowei.web.servlet.support;

import com.xiaowei.web.config.DispatcherServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @ClassName DefaultAnnotationConfigDispatcherServletInitializer
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/21 10:52
 **/
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{DispatcherServletConfiguration.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
