package com.iccs.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ccontroller {
    @GetMapping("/get")
    public String doGet()
    {
        return " Hello All i am setting the springboot using get method";
    }

    @PostMapping("/post")
    public String doPOST()
    {
        return " Hello All i am setting the springboot using post method";
    }



    
}
