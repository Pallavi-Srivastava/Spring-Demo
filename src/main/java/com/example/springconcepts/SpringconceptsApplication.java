package com.example.springconcepts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.springconcepts.component.DemoBean;

@SpringBootApplication
public class SpringconceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring concept demo !!!");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		System.out.println("Checking context:" + context.getBean(DemoBean.class));
	}
}
