package com.reviewservice.learning.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

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


    public users(String id,String username,String lastName,int reviewerId){
       this.id=id;
       this.username=username;
       this.LastName=lastName;
       this.reviewerId=reviewerId;
    }

    public String getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getFirstName(){
        return FirstName;
    }

    public String getLastName(){
        return LastName;
    }
}
