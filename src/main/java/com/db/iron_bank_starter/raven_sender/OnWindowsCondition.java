package com.db.iron_bank_starter.raven_sender;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;

public class OnWindowsCondition implements Condition {
    static Boolean flag;

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String os = System.getenv().get("OS");
        System.out.println("Operation system: " + os);
        return os.toLowerCase().contains("windows");
    }
}
