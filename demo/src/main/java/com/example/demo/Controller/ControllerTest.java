package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ControllerTest {
    
    @GetMapping("test")
    public String test() {
        return  "hello world";
    }
    
}