package com.lxl.cloudfeign.service;

import org.springframework.stereotype.Service;

/**
 * @program: springcloud
 * 【服务消费者】服务调用失败，回调处理类，EurekaFeignServiceFailure
 * @description:
 * @author: lxl
 * @create: 2020-03-26 17:15
 **/
@Service
public class EurekaFeignFailService implements EurekaFeignService{

    @Override
    public String getIndex() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }

    @Override
    public String getInfo(long uid) {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }
}
