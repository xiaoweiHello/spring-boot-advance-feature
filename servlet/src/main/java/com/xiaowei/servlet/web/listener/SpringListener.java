package com.xiaowei.servlet.web.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName SpringListener
 * @Desciption Spring 提供的 Listener，通过 SpringApplicationRunListener 的实现类 EventPublishingRunListener（该类通过 spring.factories 导入）
 *                  通过 SimpleApplicationEventMulticaster 进行事件的广播派发（循环调度实现了 ApplicationListener 接口的 Listener）
 * @Author weizheng
 * @Date 2019/8/20 11:22
 **/
@Component
public class SpringListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("timestamp : " + event.getTimestamp() + ", event " + event.getSource().getClass().getName() +  " active");
    }
}
