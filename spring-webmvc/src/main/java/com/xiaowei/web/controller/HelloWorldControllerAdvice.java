package com.xiaowei.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName HelloWorldControllerAdvice
 * @Desciption 使用切面来进行处理,结合 {@link @ExceptionHandler} 来进行全局异常捕获
 * @Author weizheng
 * @Date 2019/8/20 18:19
 **/
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

    /**
     * 将信息封装,统一在该处处理
     */
    @ModelAttribute("message")
    public String message() {
        return "Hello World!";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage) {
        System.out.println("acceptLanguage = " + acceptLanguage);
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jSessionId(@CookieValue("JSESSIONID") String jSessionId) {
        System.out.println("jSessionId = " + jSessionId);
        return jSessionId;
    }

    /**
     * 全局异常捕获
     */
    @ExceptionHandler(Throwable.class)
    public ResponseEntity<String> onError(Throwable throwable) {
        return ResponseEntity.ok(throwable.getMessage());
    }
}
