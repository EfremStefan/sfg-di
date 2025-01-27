package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class SetterInjectedController {

    private GreetingsService greetingsService;

    public void setGreetingsService(GreetingsService greetingsService) {
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
