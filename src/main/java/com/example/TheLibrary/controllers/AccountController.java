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

    @RequestMapping(value = "register")
    public String displaySignup(Model model){
        model.addAttribute("title","Sign up");

        return "account/user-enter-code";
    }

    @RequestMapping(value = "setPass")
    public String displaySetPassword(Model model){
        model.addAttribute("title","Set Password");

        return "account/user-set-password";
    }
}
