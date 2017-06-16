package com.tops.controller;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class User {
	@NotEmpty(message="User Name must not be blank")
	@Size(min = 1, max = 20,message="User Name must between 1 to 20 characters.")
	private String userName;
	
	@NotNull(message="Age must not be blank")
	@NumberFormat(style = Style.NUMBER)
	@Range(min=1, max=110, message="Age must between 1 to 110")
	private Integer age;
	
	@NotEmpty(message = "Password must not be blank.")
	@Size(min = 1, max = 10, message = "Password must between 1 to 10 Characters.")
	private String password;
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
}
