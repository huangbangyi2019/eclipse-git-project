package com.nnxy.team1;

public class Zhangshan {

	private int id;
	private String username;
	private String password;
	
	/**
	 * 新增用户功能
	 */
	public void createUser(int id, String username,String password) {
		//添加到数据库
		System.out.println("添加一条用户记录到数据库存储");
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
