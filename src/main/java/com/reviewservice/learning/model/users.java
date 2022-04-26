package com.reviewservice.learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("users")
public class users {
    @Id
    private String id;
    @Field(name="name")
    @Indexed(unique = true)
    private String username;
    @Field(name = "FName")
    private String FirstName;
    @Field(name="LName")
    private String LastName;
    @Field(name = "reviewedId")
    private int reviewerId;



}
