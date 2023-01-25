package com.onesoft.interview;

public class Static {
	
	static {
		System.out.println("Hello");
		pr();
	}
	
	public static void main(String[] args) {
		
		System.out.println("World");
		pr();
		
	}
	static {
		System.out.println("Hai");
	}
	public static void pr() {
		System.out.println("abc");
	}

}
