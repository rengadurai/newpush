package com.onesoft.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class ExampleMap {
	
	public static void main(String[] args) {
		
		
		List<BeanforExampleMap> acs1 = new ArrayList<>();
		acs1.add(new BeanforExampleMap("Tata", "Orange", 1.5f, false, 25000));
		acs1.add(new BeanforExampleMap("BlueStar", "Blue", 2f, false, 22000));
		System.out.println(acs1);
		
		List<BeanforExampleMap> acs2 = new ArrayList<>();
		acs2.add(new BeanforExampleMap("LG", "White", 1.5f, true, 30000));
		acs2.add(new BeanforExampleMap("Samsung", "Red", 2.0f, true, 32000)); 
		System.out.println(acs2);
		
		List<List<BeanforExampleMap>> listofList = Arrays.asList(acs1, acs2);
		System.out.println(listofList);
		
		List<BeanforExampleMap> flattenedList = listofList.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(flattenedList);
		
		List<Integer> listofPrice = flattenedList.stream().map(x->x.getPrice()).collect(Collectors.toList());
		System.out.println(listofPrice);
		
		int secondHighPrice = flattenedList.stream().map(x->x.getPrice()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighPrice);
		
		
		List<Integer> prices = flattenedList.stream().map(x->x.getPrice()).toList();
		List<Integer> sortedPrices = prices.stream().sorted().toList();
		System.out.println(sortedPrices.get(sortedPrices.size()-2));
		
		List<Integer> sortedPrices2 = flattenedList.stream().sorted(Comparator.comparingInt(BeanforExampleMap::getPrice)).map(x->x.getPrice()).toList();
		System.out.println(sortedPrices2);
		
		
		
		
		
	}

}
