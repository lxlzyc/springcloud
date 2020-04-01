package com.lxl.cloudzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class CloudzullApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudzullApplication.class, args);
    }

}
