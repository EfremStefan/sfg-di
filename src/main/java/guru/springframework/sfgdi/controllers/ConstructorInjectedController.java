package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.IGreetingService;

@Controller
public class ConstructorInjectedController {

	private final IGreetingService greetingService;

	public ConstructorInjectedController(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
