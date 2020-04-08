package com.yufei.springcloud.dalston.study.controller;

import com.yufei.springcloud.dalston.study.service.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @GetMapping("/consumer")
    public String consumer(){
        return dcClient.consumer();
    }
}
