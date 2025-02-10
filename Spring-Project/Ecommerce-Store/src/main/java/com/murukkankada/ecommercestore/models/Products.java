package com.murukkankada.ecommercestore.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {

    private Integer id ;
    private String title;
    private String description;
    private String imageURL;
    private Category category;

}
