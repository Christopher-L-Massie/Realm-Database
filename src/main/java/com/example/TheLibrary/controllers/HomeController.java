package com.example.TheLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {

    @RequestMapping(value = "")
    public String displayIndex(Model model){
        model.addAttribute("title", "Realm Selection");

        return "home/index";
    }
}