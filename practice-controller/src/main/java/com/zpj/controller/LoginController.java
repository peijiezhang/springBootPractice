package com.zpj.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/link")
public class LoginController {

    @RequestMapping(value = "/login")
    public String formLogin(){

        return "登录";

    }
}
