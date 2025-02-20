package com.puru.springboot_annotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("dummyValue")
    private String dummyValue;
    @Value("${user.email}")
    private String email;
    @Value("${user.username}")
    private String username;

    public String getDummyValue() {
        return dummyValue;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}
