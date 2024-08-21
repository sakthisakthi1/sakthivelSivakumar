package com.sakthi.ownproject.ownapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.repository.UserRepository;
import com.sakthi.ownproject.ownapplication.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerForUser(User userRequestDto) {
        User userResponse = userRepository.save(userRequestDto);
        return userResponse;
    }

    @Override
    public User loginForUser(String userEmailId, String userCredentials) {
        return null;

    }

}
