package com.lxl.cloudribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description: 服务消费者服务类，调用服务提供者提供的服务，测试
 * @author: lxl
 * @create: 2020-03-25 16:17
 **/
@Service
public class EurekaRibbonService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getInfoFailure")
    public String getInfo() {
        String message;
        try {
            System.out.println("调用 服务 cloud-provider-user/info");
            message = restTemplate.getForObject("http://cloud-provider-user/index", String.class);
            System.out.println("服务 cloud-provider-user/index 返回信息 : " + message);
            System.out.println("调用 服务 cloud-provider-user/index 成功！");
        } catch (Exception ex) {
            message = ex.getMessage();
        }
        return message;
    }

    /**
     * 服务 EUREKA-PROVIDER/hello 调用失败的回调方法
     *
     * @return
     */
    public String getInfoFailure() {
        String message = "网络繁忙，请稍后再试-_-。PS：服务消费者自己提供的信息";
        return message;
    }

}
