package com.onesoft.interview;

public class Example {
	    private static Example instance;

	    private Example() { }

	    public static Example getInstance() {
	        if (instance == null) {
	            instance = new Example();
	        }
	        return instance;
	    
	}


}
