package com.flybycloud.zuul.server;

import com.flybycloud.zuul.server.filter.MyFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ZuulServerApplication {

	@Bean
	public MyFilter myFilter(){
		return new MyFilter();
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerApplication.class, args);
	}
}
