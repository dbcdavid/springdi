package com.example.classes.springdi.services.environment;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"qa"})
@Service
public class QualityAssuranceServiceImpl implements EnvironmentService {

    @Override
    public String getEnvironment() {
        return "quality assurance";
    }
}
