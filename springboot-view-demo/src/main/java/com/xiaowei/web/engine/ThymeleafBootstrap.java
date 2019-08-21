package com.xiaowei.web.engine;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.*;

/**
 * @ClassName ThymeleafBootstrap
 * @Desciption TODO
 * @Author weizheng
 * @Date 2019/8/21 17:12
 **/
public class ThymeleafBootstrap {

    public static void main(String[] args) throws IOException {
        // 构建引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        // 创建渲染上下文
        Context context = new Context();
        context.setVariable("message", "Hello,World");
        // 模板的内容
//        String content = "<p th:text=\"${message}\">!!!</p>";
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));
        String content = br.readLine();
        br.close();
        // 渲染（处理）结果
        String result = templateEngine.process(content, context);
        // 输出渲染（处理）结果
        System.out.println(result);
    }
}
