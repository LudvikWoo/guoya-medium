package com.guoyasoft.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class User {
	private String userName;
	private String realName;
	private String password;
	private String age;
	public String getUserName() {
		SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c=Calendar.getInstance();
		String startTime=sf.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 1);
		String endTime=sf.format(c.getTime());
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getRealName() {
		return realName;
	}
	
	public void setRealName(String realName) {
		this.realName = realName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", realName=" + realName
				+ ", password=" + password + ", age=" + age + "]";
	}
	
	
}
