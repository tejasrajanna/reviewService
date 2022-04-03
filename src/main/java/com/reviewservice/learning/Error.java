package com.reviewservice.learning;


import lombok.Data;


public class Error {
    private String err="requested content is not found";
    private int id1;
    public Error(int id, String content){
        this.err=content;
        this.id1=id;
    }
    public int getId(){
        return id1;
    }
    public String getErr(){
        return err;
    }
}
