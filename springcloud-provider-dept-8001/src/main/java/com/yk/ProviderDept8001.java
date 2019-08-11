package com.yk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class ProviderDept8001{

    public static void main( String[] args ) {
        SpringApplication.run(ProviderDept8001.class,args);
    }
}
