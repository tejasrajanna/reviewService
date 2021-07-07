package com.reviewservice.learning;

import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class controller {
    private static final String template="Hello, %s";
    private final AtomicLong counter=new AtomicLong();
    private static long temp=0;
    //private JSONObject resp={'test':'test'};
    @GetMapping("/api")
    public reviews review1 (@RequestParam(value = "name",defaultValue = "world")String name,@RequestParam(value = "id",defaultValue = "1")Long idin){
        reviews rev=new reviews(idin,name);
            return rev;
        }


}
