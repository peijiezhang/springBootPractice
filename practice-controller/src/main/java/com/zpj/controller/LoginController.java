package com.zpj.controller;



import dto.data.User;
import service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/link")
public class LoginController {

    @Autowired
    UserLoginService userLoginService;


    @RequestMapping(value = "/login")
    public String formLogin(User user){

        boolean ok = userLoginService.login( user);
        String result = ok ? "success":"failed";
        return result;

    }
}
