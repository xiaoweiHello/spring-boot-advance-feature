package com.xiaowei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 * @ClassName HelloWorldController
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/21 17:20
 **/
@Controller
public class HelloWorldController {

    /**
     * 使用 thymeleaf 模板进行测试访问
     */
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello-world";
    }

    /**
     * 使用 jsp 模板进行测试访问
     *      注意：maven 多模块的情况下，对于 jsp 文件的路径寻找 springBoot 存在 bug，默认是去 maven 的根项目获取路径，导致文件的不存在问题（模块单独打包之后是不会出现该问题的）
     *      解决：通过自定义 WebServerFactoryCustomizer<TomcatServletWebServerFactory> bean，自行设置 jsp 的查找路径
     */
    @GetMapping
    public String index() {
        return "index";
    }

    /**
     * 向 Model 注入 message 属性
     */
    @ModelAttribute("message")
    public String message() {
        return "Hello World!";
    }
}
