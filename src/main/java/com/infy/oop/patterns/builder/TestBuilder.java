package com.infy.oop.patterns.builder;

public class TestBuilder {
	
	public static void main(String[] args) {
		
		Student student = new Student.StudentBuilder("Ram", "ABC")
				.address("Pune")
				.age(18)
				.phone("123445")
				.marksInPercentage(67.8f)
				.build();
		
		System.out.println(student);
	}

}
