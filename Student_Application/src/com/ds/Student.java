package com.ds;

import java.util.Date;

public class Student {

	private int id;
	private String name;
	private Date dob;
	private int age;
	private long contact;
	private String address;

	public Student() {

	}

	public Student(int id, String name, Date dob, int age, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public Date getDob() {
		return dob;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
