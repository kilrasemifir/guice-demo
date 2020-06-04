package guice.demo.services.impl;

import guice.demo.services.MessageService;

public class MessagePrinterService implements MessageService {

	@Override
	public void send(String message) {
		System.out.println(message);
	}

}
