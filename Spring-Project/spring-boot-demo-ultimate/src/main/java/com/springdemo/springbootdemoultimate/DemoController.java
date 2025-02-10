package com.springdemo.springbootdemoultimate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class DemoController {
   @GetMapping("/sayHello")
    public String index() {
       return "Hello World and this is my first spring boot demo ultimate, iam happy now ";
   }
}
