package com.terra.Sprinterafrm.frontcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/home")
    public String home(){
        return "Hi Spring Tera home";
    }
}
