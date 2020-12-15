package com.blz.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloProjectApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		SpringApplication.run(HelloProjectApplication.class, args);
	}
}
