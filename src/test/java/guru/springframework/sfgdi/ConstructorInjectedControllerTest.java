package guru.springframework.sfgdi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;
	
	@BeforeEach
	private void setUp() {
		controller = new ConstructorInjectedController(new GreetingService());
	}

	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}
}
