package com.lxl.cloudzull.config;

import com.lxl.cloudzull.filter.AuthFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springcloud
 * @description: config
 * @author: lxl
 * @create: 2020-04-01 16:02
 **/
@Configuration
public class EurekaZuulConfig {

    @Bean
    public AuthFilter authFilter(){
        return new AuthFilter();
    }

}
