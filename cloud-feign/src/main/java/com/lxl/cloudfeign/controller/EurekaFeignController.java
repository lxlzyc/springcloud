package com.lxl.cloudfeign.controller;

import com.lxl.cloudfeign.service.EurekaFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @program: springcloud
 * @description: 服务消费控制器类
 * @author: lxl
 * @create: 2020-03-25 16:48
 **/
@RestController
public class EurekaFeignController {

    @Resource
    private EurekaFeignService eurekaFeignService;

    @RequestMapping("/feignIndex")
    public String feignIndex() {
        String message = eurekaFeignService.getIndex();
        return "获取到的信息:" + message;
    }

    @RequestMapping("/feignInfo")
    public String feignInfo() {
        HashMap<String,Long> hashMap = new HashMap<>();
        hashMap.put("uid",1L);
        String message = eurekaFeignService.getInfo(1L);
        return "获取到的信息:" + message;
    }
}
