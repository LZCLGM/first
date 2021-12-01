package com.example.yuanhui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class YuanhuiApplication {

    public static void main(String[] args) {
        SpringApplication.run(YuanhuiApplication.class, args);
    }

    @RequestMapping(value = "/index")
    public String one(Model m){
        m.addAttribute("msg","你好");
        return "index.html";
    }
}
