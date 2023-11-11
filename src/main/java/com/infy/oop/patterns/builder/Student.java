package com.infy.oop.patterns.builder;

public class Student {

	// All final attributes
	private final String firstName; // required
	private final String lastName; // required
	private final int age; // optional
	private final String phone; // optional
	private final String address; // optional
	private final float marksInPercentage; // optional

	public Student(StudentBuilder studentBuilder) {
		this.firstName = studentBuilder.firstName;
		this.lastName = studentBuilder.lastName;
		this.age = studentBuilder.age;
		this.phone = studentBuilder.phone;
		this.address = studentBuilder.address;
		this.marksInPercentage = studentBuilder.marksInPercentage;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	public float getMarksInPercentage() {
		return marksInPercentage;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + ", marksInPercentage=" + marksInPercentage + "]";
	}

	public static class StudentBuilder {
		private final String firstName; // required
		private final String lastName; // required
		private int age; // optional
		private String phone; // optional
		private String address; // optional
		private float marksInPercentage;

		public StudentBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public StudentBuilder age(int age) {
			this.age = age;
			return this;
		}

		public StudentBuilder phone(String phone) {
			this.phone = phone;
			return this;
		}

		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}

		public StudentBuilder marksInPercentage(float marks) {
			this.marksInPercentage = marks;
			return this;
		}

		public Student build() {
			Student student = new Student(this);
			// validate student object
			if (validateStudentObject(student))
				return student;
			else
				return null;
		}

		private boolean validateStudentObject(Student student) {

			if (!(student.age >= 18)) {
				System.out.println("Can not build Student Object due ti invalid age!!");
				return false;
			}
			return true;

		}
	}
}
