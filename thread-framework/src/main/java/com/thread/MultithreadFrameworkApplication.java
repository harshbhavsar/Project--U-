package com.thread;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultithreadFrameworkApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(MultithreadFrameworkApplication.class, args);
	}
}
