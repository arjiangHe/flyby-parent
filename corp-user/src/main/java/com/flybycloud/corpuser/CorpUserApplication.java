package com.flybycloud.corpuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableDiscoveryClient
//开启支持fegin
@EnableFeignClients
@EnableHystrix
public class CorpUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(CorpUserApplication.class, args);
	}
}
