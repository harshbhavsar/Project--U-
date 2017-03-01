package com.thread.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.thread.service.MultithreadTask;

//@Controller
public class MultithreadTaskController {

	
	@Autowired
	private MultithreadTask multithreadtask;
	
	
	public void method(){
		multithreadtask.performTask();	
	}
	
}
