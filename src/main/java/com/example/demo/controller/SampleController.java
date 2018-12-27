package com.example.demo.controller;


import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class SampleController {
    @RequestMapping("/")
    String home(){
        return "Hello World!";
    }

    @RequestMapping("/testjson")
    public Object testjson(){
        return new User(10,"abc","18962526669",new Date());
    }
}
