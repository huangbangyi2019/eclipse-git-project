package com.git;

public class Student {

	private int id;
	private String username;
	private String password;
	private int age;
	private int sex;
	private String[] teacher;
	private String[] love;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	public String[] getTeacher() {
		return teacher;
	}
	public void setTeacher(String[] teacher) {
		this.teacher = teacher;
	}
	public String[] getLove() {
		return love;
	}
	public void setLove(String[] love) {
		this.love = love;
	}
}
