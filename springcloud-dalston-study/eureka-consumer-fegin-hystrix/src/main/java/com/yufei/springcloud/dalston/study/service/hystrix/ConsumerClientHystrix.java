package com.yufei.springcloud.dalston.study.service.hystrix;

import com.yufei.springcloud.dalston.study.service.ConsumerClient;
import org.springframework.stereotype.Component;


@Component
public class ConsumerClientHystrix implements ConsumerClient {

    /**
     * 服务降级
     * @return
     */
    @Override
    public String consumer() {
        return "服务降级处理结果";
    }
}