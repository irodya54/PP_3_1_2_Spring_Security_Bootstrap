package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorizationController {
    @GetMapping("/")
    public String redirect() {
        return "redirect:auth/login";
    }
    @GetMapping("auth/login")
    public String loginPage() {
        return "/auth/login";
    }
}
