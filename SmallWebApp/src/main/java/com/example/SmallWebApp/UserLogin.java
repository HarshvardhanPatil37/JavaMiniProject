package com.example.SmallWebApp;

public class UserLogin {

	private String UEmail;
	private String Password;
	
	public String getUEmail() {
		return UEmail;
	}
	public void setUEmail(String uEmail) {
		UEmail = uEmail;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [UEmail=" + UEmail + ", Password=" + Password + "]";
	}
	
}
