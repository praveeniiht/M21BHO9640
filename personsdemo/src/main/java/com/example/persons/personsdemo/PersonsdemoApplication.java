package com.example.persons.personsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.persons.personsdemo")
public class PersonsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonsdemoApplication.class, args);
	}

}
