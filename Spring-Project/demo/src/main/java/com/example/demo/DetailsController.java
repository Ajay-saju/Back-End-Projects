package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetailsController {

    @GetMapping("/details/{name}/{intValue}")
    public String details(@PathVariable("name") String name, @PathVariable("intValue") int age) {
        return "My name is " + name + " and age is " + age;
    }
}
