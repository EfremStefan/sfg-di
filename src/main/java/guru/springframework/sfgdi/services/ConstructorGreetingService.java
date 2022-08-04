package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements IGreetingService {

	@Override
	public String sayGreeting() {
		
		return "Hello World - Constructor";
	}

}
