package com.lxl.cloudprovideruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud
 * @description: index
 * @author: lxl
 * @create: 2020-03-25 14:46
 **/
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "provider user success";
    }

}
