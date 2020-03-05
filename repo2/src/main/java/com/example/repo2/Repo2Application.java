package com.example.repo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Repo2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
