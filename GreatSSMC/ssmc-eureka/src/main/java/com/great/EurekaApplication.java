package com.great;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author ZhPJ
 * @Date 2018/9/27 10:18
 * @Version 1.0
 * @Description: 服务注册中心, @springBootApplication 说明是一个springboot项目，@EnableEurekaServer 是一个Eureka的服务器
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
