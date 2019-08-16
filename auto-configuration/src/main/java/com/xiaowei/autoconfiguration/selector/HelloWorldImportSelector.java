package com.xiaowei.autoconfiguration.selector;

import com.xiaowei.autoconfiguration.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName HelloWorldImportSelector
 * @Desciption 实现 {@link ImportSelector} 接口，用于指定导入的类
 * @Author weizheng
 * @Date 2019/8/16 18:17
 **/
public class HelloWorldImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{HelloWorldConfiguration.class.getName()};
    }
}
