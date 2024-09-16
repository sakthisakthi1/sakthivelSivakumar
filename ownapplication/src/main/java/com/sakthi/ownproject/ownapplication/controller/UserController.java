package com.sakthi.ownproject.ownapplication.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;
import com.sakthi.ownproject.ownapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @GetMapping("/login")
    public UserResponseDto loginForUser(@RequestBody UserRequestDto userRequestDto) {
        UserResponseDto stringMessage = userService.loginForUser(userRequestDto);
        return stringMessage;
    }

}
