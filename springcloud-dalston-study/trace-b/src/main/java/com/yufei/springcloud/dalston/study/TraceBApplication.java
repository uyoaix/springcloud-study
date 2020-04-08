package com.yufei.springcloud.dalston.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class TraceBApplication {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/trace-b")
    public String trace(HttpServletRequest request){
        logger.info("===<call trace-b, TraceId={}, SpanId={}>===",
                request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
        return "trace-b";
    }


    public static void main(String[] args) {
        SpringApplication.run(TraceBApplication.class, args);
    }
}
