package com.example.loginfacebookandgoogle.controller;

import com.example.loginfacebookandgoogle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


}
