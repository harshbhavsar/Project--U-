package com.thread.service.impl;

import com.thread.service.MultithreadTask;

public class MultithreadTaskImpl implements MultithreadTask {

	@Override
	public void performTask() {
		System.out.println("Perform ");
		
		System.out.println("i lv u");
	}

}
