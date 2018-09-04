package com.db.iron_bank_starter.frontend_convention;

import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@RestController
public @interface FrontEndConventionRestController {
}
