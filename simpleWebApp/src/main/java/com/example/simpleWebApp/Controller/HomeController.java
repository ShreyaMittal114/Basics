package com.example.simpleWebApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {


     @RequestMapping("/")
//     @ResponseBody
    public String greet(){
         System.out.println("i am here");
        return "Hello world";
    }

    @RequestMapping("/about")
    public  String about(){
         return "hey Potterheads";
    }

}
