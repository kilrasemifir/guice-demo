package guice.demo.controllers;

import guice.demo.services.MessageService;

public class MessageController {

	private MessageService service;// = new MessageFileService();
	
	public MessageController(MessageService service ) {
		this.service = service;
	}
	
	public void hello() {
		this.service.send("Hello world");
	}
	
	public void send(String message) {
		service.send(message);
	}
}
