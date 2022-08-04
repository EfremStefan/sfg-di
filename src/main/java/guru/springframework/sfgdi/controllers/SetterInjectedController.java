package guru.springframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.IGreetingService;

@Controller
public class SetterInjectedController {
	
	private IGreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}
	@Autowired
	public void setGreetingService(IGreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	
}
