package com.prova.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/ciao")
    public String ciao(){
        return "Ciao!";
    }
    }
