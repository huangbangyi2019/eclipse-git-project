package com.nnxy.team3;

public class Wangwu {

	private int id;
	private String username;
	private String newPassword;
	private String olePassword;
	
	/**
	 * �����ܴa
	 * @param id�� Ψһ�˳�
	 * @param username�� �Ñ���
	 * @param oldPassword���f�ܴa
	 * @param newPassword�����ܴa
	 */
	public void modefyPassword(int id,String username,String oldPassword, String newPassword){
		//���������ܴa
		System.out.println("�����ܴa");
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

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getOlePassword() {
		return olePassword;
	}

	public void setOlePassword(String olePassword) {
		this.olePassword = olePassword;
	}
}
