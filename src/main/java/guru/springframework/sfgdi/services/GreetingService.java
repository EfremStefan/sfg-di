package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

	@Override
	public String sayGreeting() {
		
		return "Hello World";
	}

}
