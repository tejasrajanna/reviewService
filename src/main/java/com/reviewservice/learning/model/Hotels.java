package com.reviewservice.learning.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("hotels")
public class Hotels {
    @Id
    private String id;
    @Field(name = "HName")
    private String name;
    @Field(name="cusine")
    private CuisineEnum cuisine;
    @Field(name="address")
    private  String address;
    @Field(name="phoneNo")
    private long pno;



}

