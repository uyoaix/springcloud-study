package com.yufei.springcloud.dalston.study.service;

import com.yufei.springcloud.dalston.study.service.hystrix.ConsumerClientHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "eureka-client", fallback = ConsumerClientHystrix.class)
public interface ConsumerClient {

    @GetMapping("/dc")
    String consumer();

}
