package com.puru.springboot_annotations.lazy;

import org.springframework.stereotype.Component;

@Component
public class EagerLoader {

    public EagerLoader(){
        System.out.println("EagerLoader...");
    }
}
