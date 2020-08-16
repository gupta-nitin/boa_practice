package com.ds;

import java.util.Date;

public class Student {
	
	
	private int id;
	private String name;
	private Date dob;
	
	private int age;
	private long contact;

	
	public Date getDob() {
		return dob;
	}

	public long getContact() {
		return dob;
	}

	public void setContact(long contact) {
		return contact;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
