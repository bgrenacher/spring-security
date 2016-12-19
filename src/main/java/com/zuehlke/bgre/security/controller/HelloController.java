package com.zuehlke.bgre.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(method= RequestMethod.GET)
    public String sayHello(@RequestParam(required = false) String name){
        String welcomeText = "Welcome";
        if(name != null && !name.isEmpty()){
            welcomeText += " " + name;
        }
        return welcomeText;
    }
}
