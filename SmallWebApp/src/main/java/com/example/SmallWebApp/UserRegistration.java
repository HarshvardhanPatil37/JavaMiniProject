package com.example.SmallWebApp;


public class UserRegistration {

	private String UName;
	private String EmailId;
	private String Password;
	private String CPassword;
	private String Phone;
	
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	
	public String getUName() {
		return UName;
	}
	public void setUName(String uName) {
		UName = uName;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserRegistration [UName=" + UName + ", EmailId=" + EmailId + ", Password=" + Password
				+ ", CPassword=" + CPassword + ", Phone=" + Phone + "]";
	}
	
}
