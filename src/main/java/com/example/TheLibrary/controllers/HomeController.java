package com.example.TheLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class HomeController {

    @RequestMapping(value = "home")
    public String displayIndex(Model model){
        model.addAttribute("title", "Deviate Delight");

        return "home/index";
    }

    @RequestMapping(value="")
    public String displayComingSoon(Model model){
        model.addAttribute("title","Deviate Delight");

        return "prelaunch/coming-soon";
    }

    @RequestMapping(value = "calendar")
    public String displayRealmCalendar(Model model){
        model.addAttribute("title","Event Calendar");

        return "home/calendar";
    }
}
