package com.yk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.yk")
@ComponentScan("com.yk")
public class ConsumerDeptFeign80 {

    public static void main( String[] args ) {
        SpringApplication.run(ConsumerDeptFeign80.class);
    }
}
