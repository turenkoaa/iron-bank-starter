package com.db.iron_bank_starter.raven_sender;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Conditional(OnWindowsCondition.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionalOnWindows {
}
