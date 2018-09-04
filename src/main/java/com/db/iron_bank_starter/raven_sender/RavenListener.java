package com.db.iron_bank_starter.raven_sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class RavenListener implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("Raven was sent to " + ravenProperties.getDestination());
    }
}
