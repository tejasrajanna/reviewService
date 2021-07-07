package com.reviewservice.learning;



public class reviews {
    private Long id;
    private String name;

    private final String content;

    public reviews(long id, String content){
        this.id=id;
        this.content=content;

    }
    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }
}
