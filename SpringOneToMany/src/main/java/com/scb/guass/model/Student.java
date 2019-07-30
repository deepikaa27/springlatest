package com.scb.guass.model;
import java.util.ArrayList;
public class Student {
	private int customerId;
	private String corporateName;
	private String email;
	private int mobile;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCorporateName() {
		return corporateName;
	}
	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Student(int customerId, String corporateName, String email, int mobile) {
		super();
		this.customerId = customerId;
		this.corporateName = corporateName;
		this.email = email;
		this.mobile = mobile;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [customerId=" + customerId + ", corporateName=" + corporateName + ", email=" + email
				+ ", mobile=" + mobile + "]";
	}
	
}
