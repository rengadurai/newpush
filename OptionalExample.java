package com.onesoft.interview;

import java.util.Optional;

public class OptionalExample {
	
	
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty);
        System.out.println(empty.isPresent()); // false
        
        
        Optional<String> value = Optional.of("Hello");
        System.out.println(value.get()); // "Hello"
        
        
        Optional<String> value1 = Optional.ofNullable(null);
        System.out.println(value1+":x");
        System.out.println(value1.isPresent()); // true
        
        value1 = Optional.ofNullable(null);
        System.out.println(value1.isPresent()); // false

        
    }
}
