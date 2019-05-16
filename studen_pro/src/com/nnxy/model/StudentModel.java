package com.nnxy.model;

public class StudentModel {
	private int id;//唯一标识
	private String username;
	private String password;
	private int sex;
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
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public StudentModel(int id, String username, String password, int sex) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + "]";
	}
	
}
