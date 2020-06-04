package guice.demo;

import guice.demo.controllers.MessageController;
import guice.demo.services.impl.MessagePrinterService;

public class App {

	public static void main(String[] args) {
		MessageController controller = new MessageController(new MessagePrinterService());
		controller.send("Mon msg");
	}

}
