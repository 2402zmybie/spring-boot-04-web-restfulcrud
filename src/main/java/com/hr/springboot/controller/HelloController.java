package com.hr.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/success")
    public String success(Map<String,Object> map) {
        //classpath:/templates/success.html
        //给页面设置值, 用于thymeleaf模板引擎解析
        map.put("hello","<h1>你好呀</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }
}
