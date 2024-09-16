package com.sakthi.ownproject.ownapplication.service;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;

@Service
public interface UserService {

    User registerForUser(User userRequestDto);

    UserResponseDto loginForUser(UserRequestDto userRequestDto);
}
