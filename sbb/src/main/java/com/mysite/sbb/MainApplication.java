package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainApplication {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        System.out.println("index() 호출");

        return "메롱";
    }

    @GetMapping("hello")
    public void hello() {
        System.out.println("hello() 호출");
    }
}
