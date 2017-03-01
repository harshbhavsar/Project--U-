package com.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.thread.service.MultithreadTask;
import com.thread.service.impl.MultithreadTaskImpl;

@SpringBootApplication
public class MultithreadFrameworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultithreadFrameworkApplication.class, args);
	}
	
//	@Bean
//	public MultithreadTask multiThreadTask(){
//		MultithreadTaskImpl imp = new MultithreadTaskImpl();
////		impl.set(P);
//		return imp;
//	}
}
