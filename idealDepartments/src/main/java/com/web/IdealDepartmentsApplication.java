package com.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class IdealDepartmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdealDepartmentsApplication.class, args);
	}

}
