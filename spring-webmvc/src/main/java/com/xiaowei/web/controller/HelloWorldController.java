package com.xiaowei.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloWorldController
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/20 15:18
 **/
@Controller
public class HelloWorldController {

    @RequestMapping("")
    public String hello(@RequestParam int num) {
//        System.out.println("acceptLanguage = " + acceptLanguage);
//        model.addAttribute("acceptLanguage", acceptLanguage);
//        System.out.println("jSessionId = " + jSessionId);
//        model.addAttribute("jsessionId", jSessionId);
//        model.addAttribute("message", "Hello World!");
        return "index";
    }

    /**
     * 注解获取值的方式会优先于 handler 的方法(即上述的 hello() 方法)
     * @return
     */
//    @ModelAttribute("message")
//    public String message() {
//        return "Hello World!";
//    }
//
//    @ModelAttribute("acceptLanguage")
//    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
//        System.out.println("acceptLanguage = " + acceptLanguage);
//        return acceptLanguage;
//    }
//
//    @ModelAttribute("jsessionId")
//    public String jSessionId(@CookieValue("JSESSIONID") String jSessionId) {
//        System.out.println("jSessionId = " + jSessionId);
//        return jSessionId;
//    }
}
