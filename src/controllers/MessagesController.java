package controllers;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.faces.bean.ManagedBean;

import database.MessagesDataBaseSimulator;
import models.Chat;

@ManagedBean
public class MessagesController {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String readMessage() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		Chat chat = new Chat(message, LocalTime.now().format(dtf));
		MessagesDataBaseSimulator.MESSAGES.add(chat);
		return "main-page";
	}
	
	public List<Chat> getMessagesList(){ //will not work if it does not start with get !!!
		return MessagesDataBaseSimulator.MESSAGES;
	}
	
//	Original work with strings, trying with objects now ^
//	
//	public String readMessage() {
//		MessagesDataBaseSimulator.StringMESSAGES.add(message);
//		return "main-page";
//	}
//	
//	public List<String> getMessagesList(){ //will not work if it does not start with get !!!
//		//return test;
//		return MessagesDataBaseSimulator.StringMESSAGES;
//	}
	
	
}
