package com.nnxy.team5;

public class Lily {

	private int id;
	private String username;
	private String password;
	
	/**
	 * ����û�
	 * @param id �� Ψһ��ʼ
	 * @param username�� �û���
	 * @param password�� ����
	 */
	public void createUser(int id, String username,String password){
		// �����ݿ����һ���û�
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
