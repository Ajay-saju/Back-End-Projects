package com.murukkankada.ecommercestore.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/products")
    public void getAllProduct (){}


    @GetMapping("/products/{id}")
    public void getProductById() {}

    public void createProduct(){}

    public void deleteProductById(){}

}
