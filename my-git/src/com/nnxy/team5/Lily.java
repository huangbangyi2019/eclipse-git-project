package com.nnxy.team5;

public class Lily {

	private int id;
	private String username;
	private String password;
	
	/**
	 * 添加用户
	 * @param id ， 唯一标始
	 * @param username， 用户名
	 * @param password， 密码
	 */
	public void createUser(int id, String username,String password){
		// 往数据库添加一个用户
		System.out.println("id=" + id+", username = " + username+",password=" + password);
	}

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
}
