package com.example.demo.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/home")
    public String home() {
        return "hello world";
    }



}
