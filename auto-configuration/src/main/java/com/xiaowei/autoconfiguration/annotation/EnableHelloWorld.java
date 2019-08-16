package com.xiaowei.autoconfiguration.annotation;

import com.xiaowei.autoconfiguration.configuration.HelloWorldConfiguration;
import com.xiaowei.autoconfiguration.selector.HelloWorldImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
//@Import(HelloWorldConfiguration.class)      // 导入 helloWorld 配置类，直接指定导入的配置类（直接）
@Import(HelloWorldImportSelector.class)     // 通过 selector 返回的数组，指定需要导入的配置类列表（间接），springBoot中使用的模式
public @interface EnableHelloWorld {
}
