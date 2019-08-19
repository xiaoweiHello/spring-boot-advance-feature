package com.xiaowei.autoconfiguration.configuration;

import com.xiaowei.autoconfiguration.annotation.EnableHelloWorld;
import com.xiaowei.autoconfiguration.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName HelloWorldAutoConfiguration
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 11:59
 **/
//@Configuration          // 模式注解
@EnableHelloWorld       // 自动装配
@ConditionOnSystemProperty(name = "user.name", value = "weizheng")          // 条件装配
public class HelloWorldAutoConfiguration {
}
