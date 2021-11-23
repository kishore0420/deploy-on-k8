package com.kishore.demo.kishorek8demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class kishorek8DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Deploy 0n k8s - Hello everyone welcome to capgemini";
    }
}
