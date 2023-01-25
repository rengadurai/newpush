package com.onesoft.interview;

	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class Student implements Comparable<Student> {
	    private String firstName;
	    private String lastName;

	    public Student(String firstName, String lastName) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public String getFirstName() {
	        return firstName;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    @Override
	    public int compareTo(Student other) {
	        return this.lastName.compareTo(other.lastName);
	    }

	    @Override
	    public String toString() {
	        return firstName + " " + lastName;
	    }

	    public static void main(String[] args) {
	        List<Student> students = new ArrayList<>();
	        students.add(new Student("Alice", "Smith"));
	        students.add(new Student("Bob", "Johnson"));
	        students.add(new Student("Charlie", "Williams"));

	        Collections.sort(students);
	        System.out.println(students);
	    }
	}



