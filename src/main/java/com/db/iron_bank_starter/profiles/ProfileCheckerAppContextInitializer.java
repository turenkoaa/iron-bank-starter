package com.db.iron_bank_starter.profiles;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileCheckerAppContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        if (applicationContext.getEnvironment().getActiveProfiles().length == 0)
            throw new RuntimeException("Without com.db.iron_bank_starter.profiles!");
    }
}
