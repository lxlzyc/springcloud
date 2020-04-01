package com.lxl.cloudfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springcloud
 * @description: 服务消费者，调用服务提供者提供的服务
 * @author: lxl
 * @create: 2020-03-25 16:46
 **/
@FeignClient(value = "cloud-provider-user", fallback = EurekaFeignFailService.class) // 调用的服务的名称
public interface EurekaFeignService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String getIndex();

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    String getInfo(@RequestParam(value="uid") long uid);

}
