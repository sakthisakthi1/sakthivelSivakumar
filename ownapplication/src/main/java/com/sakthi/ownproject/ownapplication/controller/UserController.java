package com.sakthi.ownproject.ownapplication.controller;

import org.springframework.web.bind.annotation.RestController;
import com.sakthi.ownproject.ownapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("v1/api/ManagementService")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public String loginForUser(@RequestParam String userEmailId, @RequestParam String userCredentials) {
        String stringMessage = userService.loginForUser(userEmailId, userCredentials);
        return stringMessage;
    }

}
