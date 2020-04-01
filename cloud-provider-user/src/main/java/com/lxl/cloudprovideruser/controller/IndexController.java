package com.lxl.cloudprovideruser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: springcloud
 * @description: index
 * @author: lxl
 * @create: 2020-03-25 14:46
 **/
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index(HttpServletRequest request){
        String message = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getServletPath();
        return message+" provider user success";
    }


    @GetMapping("/info")
    public String info(HttpServletRequest request,long uid){
        String message = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getServletPath();
        return message+" provider user success | uid="+uid;
    }
}
