package com.example.database.Site.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
