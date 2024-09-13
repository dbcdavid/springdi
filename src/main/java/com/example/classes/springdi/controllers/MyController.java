package com.example.classes.springdi.controllers;

import com.example.classes.springdi.services.GreetingService;
import com.example.classes.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I am in MyController");

        return greetingService.sayGreeting();
    }
}
