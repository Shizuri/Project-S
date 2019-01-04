package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import database.MessagesDataBaseSimulator;
import models.Chat;

@Path("test")
public class MyResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Chat> getAllMessages(){
//		List<String> resultsList = new ArrayList<String>();
//		for(Chat c : MessagesDataBaseSimulator.MESSAGES) {
//			resultsList.add(c.getMessage());
//		}
		return MessagesDataBaseSimulator.MESSAGES;
	}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String testMethod() {
//		return "It works!";
//	}
}
