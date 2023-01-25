package com.onesoft.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterating {
	
	public static void main(String[] args) {
		 
		        List<String> myList = new ArrayList<String>();
		 
		    
		        myList.add("A");
		        myList.add("B");
		        myList.add("C");
		        myList.add("D");
		 
		        for (int i = 0; i < myList.size(); i++) {
		 		            System.out.println(myList.get(i));
		        }
		        
		        for (String x : myList) {
		        	 
		            System.out.println(x);
		        }
		        
		        int i = 0;
		        while (i < myList.size()) {
		 		            System.out.println(myList.get(i));
		 		            i++;
		        }
		        
		        Iterator<String> it = myList.iterator();
		        while (it.hasNext()) {
		 		            System.out.println(it.next());
		        }
		        
	}
	
	
}
