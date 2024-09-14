package com.example.classes.springdi.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"prod"})
@Service
public class ProductionServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "production";
    }
}
