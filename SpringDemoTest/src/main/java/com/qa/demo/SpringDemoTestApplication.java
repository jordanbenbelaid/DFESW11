package com.qa.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemoTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoTestApplication.class, args);
		
		Object byName = context.getBean("greeting");
		String byType = context.getBean(String.class);
		String byBoth = context.getBean("greeting", String.class);
		
		System.out.println(byName);
		System.out.println(byType);
		System.out.println(byBoth);
	}
	
	@Bean
	public String greeting() {
		return "Hello World!";
	}
	
	
	public String hello() {
		return "Hi";
	}

}
