package com.example.learnroadmapspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainPageController {
    @GetMapping("/")
    public String mainPage(){
        return "food.html";
    }
}
