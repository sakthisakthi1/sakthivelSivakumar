package com.sakthi.ownproject.ownapplication.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("v1/api/ManagementService")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/register/new/user")
    public User registerForUser(@RequestBody User userRequestDto) {
        User registerUser = userService.registerForUser(userRequestDto);
        return registerUser;
    }

    @PostMapping("/login")
    public User loginForUser(@RequestParam String userEmailId, @RequestParam String userCredentials) {
        User stringMessage = userService.loginForUser(userEmailId, userCredentials);
        return stringMessage;
    }

}
