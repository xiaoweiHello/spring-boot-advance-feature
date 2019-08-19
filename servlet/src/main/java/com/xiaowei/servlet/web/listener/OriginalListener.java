package com.xiaowei.servlet.web.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @ClassName OriginalListener
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/19 18:34
 **/
@WebListener
public class OriginalListener implements HttpSessionListener {

    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("--------------------- OriginalListener starting --------------------");
    }
}
