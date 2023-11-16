package com.example.demo_ex;

import org.springframework.web.bind.annotation.RequestMapping;

public class DemoExController {
    @RequestMapping("/")
    public String hello1() {

        return "index";
    }

}
