package com.sakthi.ownproject.ownapplication.service.impl;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public String loginForUser(String userEmailId, String userCredentials) {


        return userCredentials;

    }

}
