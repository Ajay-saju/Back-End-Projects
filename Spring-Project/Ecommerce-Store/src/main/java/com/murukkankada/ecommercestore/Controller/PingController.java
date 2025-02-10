package com.murukkankada.ecommercestore.Controller;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    public  String ping(){
        return "Pong";
    }
}
