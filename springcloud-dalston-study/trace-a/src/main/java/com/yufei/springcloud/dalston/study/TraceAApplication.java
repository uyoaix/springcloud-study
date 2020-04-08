package com.yufei.springcloud.dalston.study;

import com.yufei.springcloud.dalston.study.service.TraceClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class TraceAApplication {

    @Autowired
    private TraceClient traceClient;

    @RequestMapping("/trace-a")
    public String traceA(){
        log.info("===call trace-a===");
        return traceClient.traceB();
    }

    public static void main(String[] args) {
        SpringApplication.run(TraceAApplication.class, args);
    }

}
