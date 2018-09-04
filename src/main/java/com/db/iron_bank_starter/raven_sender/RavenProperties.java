package com.db.iron_bank_starter.raven_sender;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "raven")
public class RavenProperties {
    private String destination;
    private int speed;
}
