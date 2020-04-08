package com.yufei.springcloud.dalston.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("trace-b")
public interface TraceClient {

    @GetMapping("/trace-b")
    String traceB();
}
