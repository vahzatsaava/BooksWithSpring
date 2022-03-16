package com.example.bookswithspring.controllers;

import com.example.bookswithspring.services.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    MyService myService;
    MyController(MyService myService){
        this.myService = myService;
    }
    @GetMapping("/getAll")
    public String getAllLines() {
        return myService.getList().toString();
    }
    @GetMapping("/")
    public String add(){
         myService.addBook("Hey");
         myService.addBook("goo");
         return "-";
    }


}
