package com.murukkankada.ecommercestore.Controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {


    @GetMapping("/products")
    public void getAllProduct() {
    }


    @GetMapping("/products/{id}")
    public void getProductById(@PathVariable("id") Integer id) {
    }

    @PostMapping("/products")
    public void createProduct() {
    }

    public void updateProduct(@PathVariable("id") Integer id) {

    }

    @DeleteMapping("/products/{id}")
    public void deleteProductById(@PathVariable("id") Integer id) {
    }

}
