package io.project.admindomainservice.controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

public class HomeController {
    @GetMapping("/dashboard")
    public String home(Principal principal) {
        return "Hello world";
    }
}
