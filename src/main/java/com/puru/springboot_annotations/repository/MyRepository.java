package com.puru.springboot_annotations.repository;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String hello() {
        return "Hello Repository";
    }

}
