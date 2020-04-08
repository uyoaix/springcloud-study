package com.yufei.springcloud.dalston.study.controller;

import com.yufei.springcloud.dalston.study.service.ConsumerClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    private ConsumerClient consumerClient;


    @GetMapping("/consumer")
    public String consumer(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return consumerClient.consumer();
    }


}
