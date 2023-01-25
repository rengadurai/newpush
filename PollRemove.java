package com.onesoft.interview;

import java.util.LinkedList;
import java.util.Queue;

public class PollRemove {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String> ();
	      queue.add("Java");
	      queue.add("JavaFX");
	      queue.add("OpenCV");
	      queue.add("Coffee Script");
	      queue.add("HBase");
	      
	      System.out.println(queue.peek()); //returns java
	      System.out.println(queue.poll()); //returns java at the same time removes java // if queue is empty returns null
	      System.out.println(queue.remove()); //returns javafx and at the same time removes javafx  
	      										//  it throws an exception NoSuchElementFoundException 
		
	}

}
