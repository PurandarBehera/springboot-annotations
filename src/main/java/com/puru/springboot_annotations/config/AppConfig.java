package com.puru.springboot_annotations.config;

import com.puru.springboot_annotations.controller.PizzaController;
import com.puru.springboot_annotations.service.NonVegPizza;
import com.puru.springboot_annotations.service.Pizza;
import com.puru.springboot_annotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init",destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }
}
