package com.yk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerDept80 {

    public static void main( String[] args ) {
        SpringApplication.run(ConsumerDept80.class);
    }
}
