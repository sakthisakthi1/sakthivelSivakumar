package com.sakthi.ownproject.ownapplication.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.BasicResponse;
import com.sakthi.ownproject.ownapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BasicResponse> registerForUser(@RequestBody User userRequestDto) {
        BasicResponse registerUser = userService.registerForUser(userRequestDto);
        return ResponseEntity.ok().body(registerUser);
    }

    @GetMapping("/login/user")
    public ResponseEntity<BasicResponse> loginForUser(@RequestBody UserRequestDto userRequestDto) {
        BasicResponse stringMessage = userService.loginForUser(userRequestDto);
        return ResponseEntity.ok().body(stringMessage);
    }

}
