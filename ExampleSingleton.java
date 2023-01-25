package com.onesoft.interview;

public class ExampleSingleton {
	
	private static ExampleSingleton instance = null;
	
	private ExampleSingleton() {
		System.out.println("constructor called");
	}
	
	
	public static ExampleSingleton getInstance() {
	if(instance == null) {
		return instance = new ExampleSingleton();
	}
	return instance;
	}

}
