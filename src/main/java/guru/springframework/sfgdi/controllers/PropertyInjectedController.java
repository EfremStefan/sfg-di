package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingsService;

public class PropertyInjectedController{

    public GreetingsService greetingsService;

    public String getGreeting(){
        return greetingsService.sayGreeting();
    }
}
