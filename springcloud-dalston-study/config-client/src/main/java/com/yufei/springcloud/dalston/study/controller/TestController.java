package com.yufei.springcloud.dalston.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${info.from}")
    private String from;

    @RequestMapping("/from")
    public String from(){
        return this.from;
    }

}
