package com.sakthi.ownproject.ownapplication.service.impl;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User registerForUser(UserRequestDto userDto) {
        return null;

    }

    @Override
    public User loginForUser(String userEmailId, String userCredentials) {
        return null;

    }

}
