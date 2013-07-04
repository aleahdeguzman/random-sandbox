package org.jubot.models;


import java.util.List;

public class Student extends Person{
	
	private int studentno;
	private List<String> subjects; //max of 5
	private final static String course = "ICS"; // can be ICS or HRM only
	
	
	
	public int getStudentno() {
		return studentno;
	}
	public void setStudentno(int studentno) {
		this.studentno = studentno;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public static String getCourse() {
		return course;
	}
	
	
}
