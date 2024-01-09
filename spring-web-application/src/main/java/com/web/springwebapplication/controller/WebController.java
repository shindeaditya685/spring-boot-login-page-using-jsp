package com.web.springwebapplication.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {


    @GetMapping("webPage")
   // @ResponseBody
    public String webPage(@RequestParam String myName, ModelMap map) {
        map.put("sampleKey", myName);
        System.out.println("my name is: " + myName);
        return "home";
    }
}
