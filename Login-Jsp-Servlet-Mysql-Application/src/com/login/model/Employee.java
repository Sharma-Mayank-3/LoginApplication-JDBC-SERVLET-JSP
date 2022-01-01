package com.login.model;

public class Employee {
	private String userNAme;
	private int age;
	private String address;
	private String password;
	public String getUserNAme() {
		return userNAme;
	}
	public void setUserNAme(String userNAme) {
		this.userNAme = userNAme;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Employee(String userNAme, int age, String address, String password) {
		super();
		this.userNAme = userNAme;
		this.age = age;
		this.address = address;
		this.password = password;
	}
}
