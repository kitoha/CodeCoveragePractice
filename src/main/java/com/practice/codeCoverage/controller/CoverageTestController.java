package com.practice.codeCoverage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoverageTestController {

    @GetMapping("/test")
    public String test(){
        int a=1;

        return "hello";
    }
}
