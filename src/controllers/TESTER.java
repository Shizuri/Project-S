package controllers;

import database.UsersDataBaseSimulator;

public class TESTER {

	public static void main(String[] args) {
		for(String name : UsersDataBaseSimulator.USERS.keySet()) {
			System.out.println("Name: " + name + " | Value: " + UsersDataBaseSimulator.USERS.get(name));
		}

	}

}
