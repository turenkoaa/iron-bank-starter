package com.db.iron_bank_starter.frontend_convention;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

@ControllerAdvice
public class FrontEndConventionAspect implements ResponseBodyAdvice {
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        boolean annotationPresent = methodParameter.getDeclaringClass().isAnnotationPresent(FrontEndConventionRestController.class);
        System.out.println("@FrontEndConventionRestController is present: " + annotationPresent);
        return annotationPresent;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        return new BodyWrapper(o);
    }
}
