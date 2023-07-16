package com.todolistpage.todolistpage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LoginController {

    @GetMapping("/hello")
    public String hello(){
        return "Welcome to ToDoListPage!!!";
    }

}
