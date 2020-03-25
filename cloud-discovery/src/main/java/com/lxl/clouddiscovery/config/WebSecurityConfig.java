package com.lxl.clouddiscovery.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @program: springcloud
 * @description: security config
 * spring 2.X 安全配置
 * @author: lxl
 * @create: 2020-03-25 15:30
 **/
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf().disable();
        //开启认证
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
