package com.example.classes.springdi.controllers.environment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"uat", "EN"})
@SpringBootTest
class UserAcceptanceControllerTest {

    @Autowired
    EnvironmentInjectedController environmentInjectedController;

    @Test
    void sayEnvironment(){
        System.out.println(environmentInjectedController.sayEnvironment());
    }

}