package com.yang.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class JettyController {

    @RequestMapping(name = "/")
    public String test(String name){
        System.out.println(name);
        return name;
    }
}
