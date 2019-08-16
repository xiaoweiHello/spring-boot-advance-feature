package com.xiaowei.servlet.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName BeanServletDemo
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/16 14:23
 **/
public class BeanServletDemo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("BeanServletDemo Hello World!");
    }
}
