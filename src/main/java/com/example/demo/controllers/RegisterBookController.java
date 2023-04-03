package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterBookController {
    @GetMapping("/registerBook")
    public String registerBook() {
        return"registerBook";
    }
}
