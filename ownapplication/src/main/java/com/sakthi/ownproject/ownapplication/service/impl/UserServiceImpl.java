package com.sakthi.ownproject.ownapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.repository.UserRepository;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;
import com.sakthi.ownproject.ownapplication.service.UserService;
import com.sakthi.ownproject.ownapplication.utillity.MapperUtil;

@Service
public class UserServiceImpl implements UserService {

    private MapperUtil<User, UserRequestDto> userResponMapperUtil = new MapperUtil<>();

    @Autowired
    UserRepository userRepository;

    @Override
    public User registerForUser(User userRequestDto) {
        User userResponse = userRepository.save(userRequestDto);
        return userResponse;
    }

    @Override
    public UserResponseDto loginForUser(UserRequestDto userRequestDto) {
        User result = userRepository.findByUserId(userRequestDto.getUserId());
        UserResponseDto UserResponseDto = userResponMapperUtil.transfer(result, UserResponseDto.class);
        return UserResponseDto;
    }

}
