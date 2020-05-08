package com.nnxy.team3;

public class Wangwu {

	private int id;
	private String username;
	private String newPassword;
	private String olePassword;
	
	/**
	 * 更新密碼
	 * @param id， 唯一標尺
	 * @param username， 用戶名
	 * @param oldPassword，舊密碼
	 * @param newPassword，新密碼
	 */
	public void modefyPassword(int id,String username,String oldPassword, String newPassword){
		//更新數據庫密碼
		System.out.println("更新密碼");
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
