package com.murukkankada.ecommercestore.Controller;


import com.murukkankada.ecommercestore.Service.FakeStoreProductsService;
import com.murukkankada.ecommercestore.models.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ProductController {

    private final FakeStoreProductsService fakeStoreProductsService;


    public ProductController(FakeStoreProductsService inputService) {
        this.fakeStoreProductsService = inputService;  //DI
    }


    @GetMapping("/products/{id}")
    public Products getProductById(@PathVariable("id") Integer id) {

        if (id == null) {
            throw new IllegalArgumentException("id is null");
        }
        return fakeStoreProductsService.getProductById(id);
    }

    @GetMapping("/products")
    public ArrayList<Products> getAllProduct() {

//        1. any validation we want
        return fakeStoreProductsService.getAllProducts();
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
