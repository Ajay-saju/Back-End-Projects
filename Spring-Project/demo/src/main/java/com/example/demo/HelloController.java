package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping("/hello/{name}/{second_name}")
    public String hello(@PathVariable("name") String name, @PathVariable("second_name") String second_name) {
        return "Hello " + name + " " + second_name;
    }
}
