package com.puru.springboot_annotations.controller;

import com.puru.springboot_annotations.service.Pizza;
import com.puru.springboot_annotations.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class PizzaController {

    //field injection
    //@Autowired
    private VegPizza vegPizza;

    //Constructor injection
    /*@Autowired
    public PizzaController(VegPizza vegPizza){
        this.vegPizza=vegPizza;
    }*/

    /*//Setter Injection
    @Autowired
    public void setVegPizza(VegPizza vegPizza) {
        this.vegPizza = vegPizza;
    }*/

    /* Injecting Pizza interface for loose coupling

    Pizza Interface is being implemented by VegPizza & NonVegPizza classes.
    Spring will be in ambiguity to figure out which bean/component to inject,
    this is addressed by using Qualifier & primary annotations.
    Qualifier --> Specific Component to Inject
    Primary --> Precedence to a particular component to inject.
     */

    //@Autowired
    //@Qualifier("vegPizza")
    private Pizza pizza;

    public PizzaController(Pizza pizza) {
        this.pizza=pizza;
    }


    public String getPizza() {
        // return  "Hot Pizza!!";
        //  return  vegPizza.getPizza();
        return pizza.getPizza();
    }

    public void init() {
        System.out.println("Initialization Logic");
    }

    public void destroy() {
        System.out.println("Destruction Logic");
    }
}
