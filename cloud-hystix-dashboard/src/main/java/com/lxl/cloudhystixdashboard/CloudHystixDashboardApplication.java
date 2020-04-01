package com.lxl.cloudhystixdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard //启用断路器看板
@EnableDiscoveryClient
@SpringBootApplication
public class CloudHystixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudHystixDashboardApplication.class, args);
    }

}
