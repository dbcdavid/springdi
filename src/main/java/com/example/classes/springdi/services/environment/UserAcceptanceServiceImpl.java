package com.example.classes.springdi.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"uat"})
@Service
public class UserAcceptanceServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "user acceptance";
    }
}
