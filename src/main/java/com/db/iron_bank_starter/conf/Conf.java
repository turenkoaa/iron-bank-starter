package com.db.iron_bank_starter.conf;


import com.db.iron_bank_starter.frontend_convention.FrontEndConventionAspect;
import com.db.iron_bank_starter.raven_sender.ConditionalOnWindows;
import com.db.iron_bank_starter.raven_sender.RavenListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.db.iron_bank_starter.raven_sender.RavenProperties;


@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class Conf {

    @Bean
    @ConditionalOnWindows
    @ConditionalOnProperty("raven.destination")
    public RavenListener ravenListener(){
        return new RavenListener();
    }

    @Bean
    public FrontEndConventionAspect controllerAspect() {
        return new FrontEndConventionAspect();
    }
}
