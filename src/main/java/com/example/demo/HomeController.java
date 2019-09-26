package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "Home";
    }
    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    @RequestMapping("/crabcake")
    public String crabPage() {
        return "Crabcake Recipe";
    }

    @RequestMapping("/Jollof Recipe")
    public String jollofPage() {
        return "Jollof Recipe";
    }

    @RequestMapping("/Pansit Bihon Recipe")
    public String jollofPage() {
        return "Pansit Bihon Recipe";
    }

}
