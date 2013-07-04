package org.jubot.models;

import java.util.Date;

public class Person {
	
	private String name; // required, 20 chars only
	private int age;
	private Date bday;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBday() {
		return bday;
	}
	public void setBday(Date bday) {
		this.bday = bday;
	}
	
	
}
