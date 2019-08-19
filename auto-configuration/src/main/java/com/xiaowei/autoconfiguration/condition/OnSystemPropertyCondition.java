package com.xiaowei.autoconfiguration.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * @ClassName OnSystemPropertyCondition
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 11:31
 **/
public class OnSystemPropertyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attr = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
        String name = String.valueOf(attr.get("name"));
        String value = String.valueOf(attr.get("value"));

        // 系统属性，可通过 -D 参数进行设置
        String propertyValue = System.getProperty(name);
        return value.equals(propertyValue);
    }
}
