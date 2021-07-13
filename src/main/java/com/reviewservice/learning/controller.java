package com.reviewservice.learning;

import net.minidev.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@Validated
public class controller {
    private static final String template="Hello, %s";
    private final AtomicLong counter=new AtomicLong();
    private static long temp=0;
    private userRepo userRepo;
    //private JSONObject resp={'test':'test'};
    @GetMapping("/api")
    public reviews review1 (@RequestParam(required = true,value = "name")String name,@RequestParam(required = true,value = "id")Long idin){
        reviews rev=new reviews(idin,name);
            return rev;
        }



    @PostMapping("/test")
    public String test(){
    return "test";
    }




    @RequestMapping(value = "testttt",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public error errHandling(){
        int a=1;
        error er1=new error(a,"there is an issuse");
        return er1;


    }

    @GetMapping("/error")
    @ResponseStatus(code=HttpStatus.BAD_REQUEST)
    public error errorHandler(){
        error err=new error(1,"error handler for complete");
        return err;
    }


    @PostMapping("/add")
        public @ResponseBody String addNewUser (@RequestParam String name,@RequestParam String emailId, @RequestParam String userLoc){
            Date date=new Date();
            try {

                users user = new users();
                //LocalDateTime date1=new LocalDateTime();
                user.setName(name);
                user.setEmailId(emailId);
                user.setUserLocation(userLoc);
                user.setUsername("rohangrge");
                //user.setuCreatedAt(date1.now());
                userRepo.save(user);
                return "saved";
            }
            catch(Exception e) {
                return "exception";
            }
        }




    @ExceptionHandler
    public String Exception(){
    return "nah";
    }


}
