package com.onesoft.interview;

public class UseExampleSingleton {
	
	public static void main(String[] args) {
		
		ExampleSingleton ex1 = ExampleSingleton.getInstance();
		ExampleSingleton ex2 = ExampleSingleton.getInstance();
		ExampleSingleton ex3 = ExampleSingleton.getInstance();
		System.out.println(ex1.hashCode());
		System.out.println(ex2.hashCode());
		System.out.println(ex3.hashCode());
		
		

		
	}
	
	

}
