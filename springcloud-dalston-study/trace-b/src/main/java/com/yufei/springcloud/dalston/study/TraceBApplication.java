package com.yufei.springcloud.dalston.study;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class TraceBApplication {

    @GetMapping("/trace-b")
    public String trace(){
        log.info("===<call trace-b>===");
        return "trace-b";
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceBApplication.class, args);
    }
}
