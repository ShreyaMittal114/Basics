package com.example.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // if we remove this it will remove the page not data
public class LoginController{
    @RequestMapping("/login")
    public String login(){
        return "Login page...";
    }

}

