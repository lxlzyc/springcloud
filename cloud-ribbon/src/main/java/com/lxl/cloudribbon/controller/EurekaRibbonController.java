package com.lxl.cloudribbon.controller;

import com.lxl.cloudribbon.service.EurekaRibbonService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud
 * @description: 服务消费者控制器类，对用户提供服务
 * @author: lxl
 * @create: 2020-03-25 16:18
 **/
@RestController
public class EurekaRibbonController {

    @Resource
    private EurekaRibbonService eurekaRibbonService;

    @RequestMapping("/ribbonInfo")
    public String ribbonInfo() {
        String message = eurekaRibbonService.getInfo();
        return "获取的信息:" + message;
    }

}
