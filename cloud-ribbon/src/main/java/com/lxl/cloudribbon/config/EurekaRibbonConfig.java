package com.lxl.cloudribbon.config;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: springcloud
 * @description: 应用配置类
 * @author: lxl
 * @create: 2020-03-25 16:13
 **/
@Configuration
public class EurekaRibbonConfig {

    @Bean // 初始化 Bean
    @LoadBalanced // 实现负载均衡(轮询)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    //注册断路器指标流Servlet
    @Bean
    public ServletRegistrationBean getServlet() {
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
