package com.murukkankada.ecommercestore.Service;

import com.murukkankada.ecommercestore.Dto.FakeStoreResponseDto;
import com.murukkankada.ecommercestore.models.Category;
import com.murukkankada.ecommercestore.models.Products;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class FakeStoreProductsService {

    private final RestTemplate restTemplate;

    FakeStoreProductsService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ArrayList<Products> getAllProducts() {


//        1.call fakeStore api
        ResponseEntity<FakeStoreResponseDto[]> fakeStoreResponse =
                restTemplate.getForEntity("https://fakestoreapi.com/products", FakeStoreResponseDto[].class);

//        2. Get the response
        FakeStoreResponseDto[] response = fakeStoreResponse.getBody();

        if (response == null) {
            throw new IllegalArgumentException("FakeStoreResponse not found");
        }
//     3.convert fakeStoreResponse into products model

        ArrayList<Products> productsList = new ArrayList<>();
        productsList = convertFakeStoreListToProductList(response);

        return productsList;


    }

    private ArrayList<Products> convertFakeStoreListToProductList(FakeStoreResponseDto[] response) {
        ArrayList<Products> tempProductsList = new ArrayList<>();
        for (FakeStoreResponseDto fakeStoreResponseDto : response) {
            tempProductsList.add(convertFakeStoreResponseToProducts(fakeStoreResponseDto));
        }
        return tempProductsList;
    }

    public Products getProductById(Integer id) {

        Products products = new Products();

        //  1. call fake store api ---> use rest template for calling outside apis

        ResponseEntity<FakeStoreResponseDto> fakeStoreResponse =
                restTemplate.getForEntity("https://fakestoreapi.com/products/" + id, FakeStoreResponseDto.class);



        // 2. Get the response
        FakeStoreResponseDto response = fakeStoreResponse.getBody();


        if (response == null) {
            throw new IllegalArgumentException("FakeStoreResponse not found");
        }

//        3. convert response to product model
        products = convertFakeStoreResponseToProducts(response);
        // return
        return products;
    }

    private Products convertFakeStoreResponseToProducts(FakeStoreResponseDto response) {

        Category category = new Category();
        Products products = new Products();
        products.setId(response.getId());
        products.setTitle(response.getTitle());
        products.setDescription(response.getDescription());
        products.setImageURL(response.getImageURL());
        products.setCategory(category);
        category.setTitle(response.getCategory());
        return products;
    }
// doubts on category object creation

}
