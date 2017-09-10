package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/9/10.
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index (Model  model){
        Msg msg = new Msg("测试标题","测试内容","额外信息只对管理员显示");
        model.addAttribute("msg",msg);
        return  "home";
    }
}
