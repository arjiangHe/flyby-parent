package com.flybycloud.corpuser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class CorpUserApplication {
	public static void main(String[] args) {
		SpringApplication.run(CorpUserApplication.class, args);
	}
}
