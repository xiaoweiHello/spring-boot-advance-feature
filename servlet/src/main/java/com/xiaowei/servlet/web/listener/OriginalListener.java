package com.xiaowei.servlet.web.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @ClassName OriginalListener
 * @Desciption 原生Servlet Listener
 * @Author weizheng
 * @Date 2019/8/19 18:34
 **/
@WebListener
public class OriginalListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("--------------------- OriginalListener starting --------------------");
    }
}
