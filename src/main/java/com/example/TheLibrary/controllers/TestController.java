package com.example.TheLibrary.controllers;


import com.example.TheLibrary.models.Library.Book;
import com.example.TheLibrary.models.data.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping(value = "test")
public class TestController {


    @RequestMapping(value = "soon")
    public String testComingSoon(Model model){
        model.addAttribute("title", "Deviate Delight");

        return "prelaunch/coming-soon";

    }



}
