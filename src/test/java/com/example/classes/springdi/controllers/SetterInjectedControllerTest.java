package com.example.classes.springdi.controllers;

import com.example.classes.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void Setup(){
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl()) ;
    }

    @Test
    void sayHello(){
        System.out.println(setterInjectedController.sayHello());
    }
}