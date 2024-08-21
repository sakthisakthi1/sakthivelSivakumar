package com.sakthi.ownproject.ownapplication.service;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;

@Service
public interface UserService {

    User registerForUser(User userRequestDto);

    User loginForUser(String userEmailId, String userCredentials);

}
