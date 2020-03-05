package com.example.aggservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Aggservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
