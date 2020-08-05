package com.hr.springboot.controller;

import javafx.geometry.Pos;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class LoginController {

    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map) {
        if(!StringUtils.isEmpty(username) && "123456".equals(password)) {
            //登录成功,防止表单重复提交, 可以重定向到主页
            //main.html 添加了模板引擎的视图映射, 最终是到dashboard.html页面
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名密码错误");
            return "login";
        }

    }
}
