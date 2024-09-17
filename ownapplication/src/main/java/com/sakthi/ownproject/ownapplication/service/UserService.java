package com.sakthi.ownproject.ownapplication.service;

import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.BasicResponse;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;

@Service
public interface UserService {

    BasicResponse registerForUser(User userRequestDto);

    BasicResponse loginForUser(UserRequestDto userRequestDto);
}
