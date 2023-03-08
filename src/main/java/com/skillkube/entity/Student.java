package com.skillkube.entity;

public class Student {
	
	int id;
	String name;
	String rollNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Student(int id, String name, String rollNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + "]";
	}

}
