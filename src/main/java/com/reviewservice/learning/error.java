package com.reviewservice.learning;


import lombok.Data;


public class error {
    private String err="requested content is not found";
    private int id1;
    public error(int id,String content){
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
