package com.spring.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.demo.config.AppConfig;
import com.spring.demo.service.DemoService;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println(context);
		System.out.println(context.getBean(DemoService.class));
	}

}
