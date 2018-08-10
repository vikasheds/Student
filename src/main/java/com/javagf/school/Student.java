package com.javagf.school;

public class Student {
	private Integer age;
	private String name;
	private String address;

	public Student(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
