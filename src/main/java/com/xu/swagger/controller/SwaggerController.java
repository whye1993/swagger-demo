package com.xu.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @GetMapping("/get")
    public String get() {

        System.out.println("xxx");
        return "gan ba dei";
    }
}
