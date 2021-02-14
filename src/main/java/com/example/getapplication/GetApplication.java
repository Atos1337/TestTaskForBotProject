package com.example.getapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GetApplication {

    @RequestMapping("/hello")
    public String helloWithUser(@RequestParam(value = "name", defaultValue = "World")String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(GetApplication.class, args);
    }
}
