package com.devops.devopsintegration.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String sayHello(){
        System.out.println("prems");
        return "Hello world!!";
    }
}
