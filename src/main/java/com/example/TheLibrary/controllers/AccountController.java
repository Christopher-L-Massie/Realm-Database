package com.example.TheLibrary.controllers;

import com.example.TheLibrary.models.Accounts.User;
import com.example.TheLibrary.service.SecurityService;
import com.example.TheLibrary.service.UserService;
import com.example.TheLibrary.service.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class AccountController {

    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @GetMapping("/login")
    public String login(Model model, String error, String logout) {
        if (error != null)
            model.addAttribute("error", "Your username and password are invalid!");

        if (logout != null)
            model.addAttribute("message","You have been logged out successfully.");

        return "account/login";
    }

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("userForm", new User());

        return "account/registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult){
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "account/registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(),userForm.getPasswordConfirm());

        return "redirect:account/welcome";
    }

    /*
    @RequestMapping(value = "register")
    public String displayRegister(Model model){
        model.addAttribute("title","Register");

        return "account/user-register";
    }
     */

    @GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }

    @RequestMapping(value = "setPass")
    public String displaySetPassword(Model model){
        model.addAttribute("title","Set Password");

        return "account/user-set-password";
    }

    @RequestMapping(value = "manage")
    public String displayAccountManagement(Model model){
        model.addAttribute("title","Account Management");

        return "account/user-account-management";
    }
}
