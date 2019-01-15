package controllers;

import javax.faces.bean.ManagedBean;

import database.UsersDataBaseSimulator;
import models.User;

@ManagedBean
public class RegisterController {

	private String userName, password, hint;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
	public String register() {
		if(UsersDataBaseSimulator.USERS.containsKey(userName)) {
			return "user-exists";
		}
		User user = new User(userName, password, hint);
		UsersDataBaseSimulator.USERS.put(userName, user);
		return "index";
	}
}
