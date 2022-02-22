package com.example.feb22_learnbystealing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller
{
    @GetMapping("/")
    public String landingPage(){
        return "landingPage";
    }
}
