package com.onesoft.interview;

import java.util.function.Supplier;

public class RandomNumber {
	
    public static void main(String[] args) {
    	
        Supplier<Integer> randomNumber = () -> (int) (Math.random() * 6) + 1;
        
        
        System.out.println(randomNumber.get());
        
    }
}
