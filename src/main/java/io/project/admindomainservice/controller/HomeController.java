package io.project.admindomainservice.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "Hello world!!";
    }
}
