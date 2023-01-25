package com.onesoft.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestSalary {
	
	public static void main(String[] args) {
		
		 List<Integer> salaries = Arrays.asList(3000, 5000, 6000, 7000, 8000, 9000);
		 
		 int secondHighest = salaries.stream()
	                .sorted(Comparator.reverseOrder())
	                .skip(1)
	                .findFirst().get();
		
		 System.out.println(secondHighest);
		 
		
	}
	


}
