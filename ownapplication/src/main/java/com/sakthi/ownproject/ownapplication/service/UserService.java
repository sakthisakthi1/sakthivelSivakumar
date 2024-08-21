package com.sakthi.ownproject.ownapplication.service;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDao.UserDto;

@Service
public interface UserService {


    User loginForUser(String userEmailId, String userCredentials);

    User registerForUser(UserDto userDto);

}
