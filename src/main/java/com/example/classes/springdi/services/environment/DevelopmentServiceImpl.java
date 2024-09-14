package com.example.classes.springdi.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service
public class DevelopmentServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "development";
    }
}
