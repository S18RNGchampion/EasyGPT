package com.easygpt.client.custom.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/index")
    public String Health() {
        return "Hello World!";
    }
}
