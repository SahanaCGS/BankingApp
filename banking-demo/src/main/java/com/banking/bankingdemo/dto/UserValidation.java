package com.banking.bankingdemo.dto;

import com.banking.bankingdemo.entity.User;

public class UserValidation {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserValidation(User user) {
		super();
		this.user = user;
	}

	public UserValidation() {
		super();
	}

}
