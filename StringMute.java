package com.onesoft.interview;

public class StringMute {
	public static void main(String[] args) {
		
		StringBuffer sbuffer = new StringBuffer("Hello");
		StringBuilder sbuilder = new StringBuilder("Hai");
		sbuffer.append("world");
		sbuilder.append("you");
		System.out.println(sbuffer);
		System.out.println(sbuilder);
		Example e1 = Example.getInstance();
		
		System.out.println(e1);
		Example e2 = Example.getInstance();
		System.out.println(e2);
		
	}

}
