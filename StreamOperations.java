package com.onesoft.interview;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamOperations {
	


	
	    public static void main(String[] args) {
	        List<List<Integer>> lists = Arrays.asList(
	            Arrays.asList(1, 2, 3),
	            Arrays.asList(4, 5, 6),
	            Arrays.asList(7, 8, 9)
	        );
	        
	        
	        Stream<List<Integer>> stream = lists.stream();
	        Stream<Integer> flatStream = stream.flatMap(list -> list.stream());
	        List<Integer> integers = flatStream.collect(Collectors.toList());
	        System.out.println(integers);
	        
	        num(10);
	        
	        List<String> list1 = Arrays.asList("a", "b", "c");
	        List<String> list2 = Arrays.asList("1", "2", "3");

	        List<String> result = list1.stream()
	            .flatMap(s1 -> list2.stream().map(s2 -> s1 + s2))
	            .collect(Collectors.toList());

	        System.out.println(result);
	    
	}

	    public static void num(int n) {
	    	if(n>=0) {
	    		num(n-1);
	    	System.out.println(n);
	    	
	    	}
	    }
	    
	    

}
