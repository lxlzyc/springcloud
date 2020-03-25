package com.lxl.cloudprovideruser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableEurekaClient //只支持 eureka

@EnableDiscoveryClient //支持所有
public class CloudProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudProviderUserApplication.class, args);
    }

}
