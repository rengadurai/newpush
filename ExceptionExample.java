package com.onesoft.interview;

import java.util.ArrayList;
import java.util.List;

public class ExceptionExample {
	public static void main(String[] args) {
		
//		
//		try {
//		    int x = 5 / 0;
//		} catch (ArithmeticException e) {
//		    System.out.println("Arithmetic error: " + e);
//		} catch (Exception e) {
//		    System.out.println("Error: " + e);
//		}finally {
//			System.out.println("finally");
//		}
//		divide(5,0);
//		checkAge(11);
		
		try {
		    int a = 8/0;
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
		List<Integer> copy = new ArrayList<>();
		for (Integer i : copy) {
		    // code that modifies the collection
		}
		
	}
	
	public static void divide(int x, int y) throws ArithmeticException {
	    int result = x / y;
	    System.out.println(result);
	}

	public static void checkAge(int age) {
	    if (age < 18) {
	        throw new ArithmeticException("Age must be at least 18");
	    }
	}
	
	



}
