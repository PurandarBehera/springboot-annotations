package com.puru.springboot_annotations.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        return "Hello Controller";
    }

}
