package com.example.classes.springdi.controllers.environment;

import com.example.classes.springdi.services.environment.EnvironmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EnvironmentInjectedController {
    private final EnvironmentService environmentService;

    @Autowired
    public EnvironmentInjectedController(EnvironmentService environmentService) {
        this.environmentService = environmentService;
    }

    public String sayEnvironment(){
        return environmentService.getEnvironment();
    }
}
