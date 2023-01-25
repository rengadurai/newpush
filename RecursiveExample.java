package com.onesoft.interview;

public class RecursiveExample {
	
	 public static void main(String[] args) {
		    int result = sum(10);
		    System.out.println(result);
		    System.out.println(factorial(5));
		  }
	 
	 
	 
		  public static int sum(int k) {
			  
		    if (k > 0) {
		      return k + sum(k - 1);
		    } else {						//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
		    								//10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
		      return 0;
		    }
		    
		  }
		  
		  public static int factorial(int k) {
			  if(k==1) {
				  return 1;
			  }else {
				  return k * factorial(k-1);
			  }
		  }

}
