package com.roquet.threed.rest;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class NavigationController {



    @GetMapping("/home")
    public String home()  {
        return "lobby";
    }
    @GetMapping("/first")
    public String first()  {
        return "first";
    }



    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/store")
    public String store() {
        return "first";
    }



}

