package guice.demo.services.impl;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import guice.demo.services.MessageService;

public class MessageFileService implements MessageService {

	@Override
	public void send(String message) {
		try {
			PrintWriter out = new PrintWriter("messages.txt");
			out.println(message);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
