package com.entity;

public class Users {
	private int UserId;
	private String UserName;
	private String Userpassword;
	public Users()
	{
		
	}
	
	
	
	
	public Users(int userId, String userName, String userpassword) {
		//super();
		UserId = userId;
		UserName = userName;
		Userpassword = userpassword;
	}




	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserpassword() {
		return Userpassword;
	}
	public void setUserpassword(String userpassword) {
		Userpassword = userpassword;
	}
	
	

	
}
