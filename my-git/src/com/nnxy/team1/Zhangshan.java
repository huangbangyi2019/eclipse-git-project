package com.nnxy.team1;

public class Zhangshan {

	private int id;
	private String username;
	private String password;
	
	/**
	 * �����û�����
	 */
	public void createUser(int id, String username,String password) {
		//��ӵ����ݿ�
		System.out.println("���һ���û���¼�����ݿ�洢");
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
