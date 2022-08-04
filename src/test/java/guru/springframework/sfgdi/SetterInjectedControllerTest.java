package guru.springframework.sfgdi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guru.springframework.sfgdi.controllers.SetterInjectedController;
import guru.springframework.sfgdi.services.ConstructorGreetingService;

class SetterInjectedControllerTest {
	
	SetterInjectedController controller;

	@BeforeEach
	private void setUp() {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());

	}
	@Test
	void getGreeting() {
		
		System.out.println(controller.getGreeting());
	}

}
