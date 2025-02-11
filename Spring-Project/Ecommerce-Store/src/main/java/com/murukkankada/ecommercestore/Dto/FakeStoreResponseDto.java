package com.murukkankada.ecommercestore.Dto;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class FakeStoreResponseDto {

    private Integer id;
    private String title;
    private String description;
    private String imageURL;
    private String category;
}


//id:1,
//title:'...',
//price:'...',
//category:'...',
//description:'...',
//image:'...'