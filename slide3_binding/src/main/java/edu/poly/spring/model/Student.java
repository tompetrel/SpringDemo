package edu.poly.spring.model;

public class Student {
	private String studentId, name;

	public Student() {
		
	}

	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
