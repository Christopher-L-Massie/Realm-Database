package com.example.TheLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    @RequestMapping(value = "login")
    public String displayIndex(Model model){
        model.addAttribute("title", "Login");

        return "account/user-login";
    }
}
