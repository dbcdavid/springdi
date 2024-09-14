package com.example.classes.springdi.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DevelopmentControllerTest {

    @Autowired
    EnvironmentInjectedController environmentInjectedController;

    @Test
    void sayEnvironment(){
        System.out.println(environmentInjectedController.sayEnvironment());
    }

}