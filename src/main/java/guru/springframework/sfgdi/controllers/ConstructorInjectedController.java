package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class ConstructorInjectedController {

    private final GreetingsService greetingsService;

    public ConstructorInjectedController(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
