package com.example.eureka.noteseurekaclient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
@SpringBootApplication
@ComponentScan(basePackages="com.example.eureka.noteseurekaclient")
@EnableEurekaClient
@EnableSwagger2
@EnableHystrix  
public class NoteseurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(NoteseurekaclientApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate getTempalate() {
		return new RestTemplate();
	}

}
