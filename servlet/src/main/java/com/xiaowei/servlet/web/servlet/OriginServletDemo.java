package com.xiaowei.servlet.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName OriginServletDemo
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/16 14:16
 **/
@WebServlet(urlPatterns = "/origin/servlet")
public class OriginServletDemo extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("OriginServletDemo Hello World!");
    }
}
