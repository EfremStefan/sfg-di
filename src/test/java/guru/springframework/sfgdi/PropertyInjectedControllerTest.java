package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.services.GreetingService;

public class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	private void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new GreetingService();
	}
	
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}
}
