package com.sakthi.ownproject.ownapplication.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakthi.ownproject.ownapplication.config.MessageProperties;
import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.repository.UserRepository;
import com.sakthi.ownproject.ownapplication.requestDto.UserRequestDto;
import com.sakthi.ownproject.ownapplication.responseDto.BasicResponse;
import com.sakthi.ownproject.ownapplication.responseDto.ErrorResponse;
import com.sakthi.ownproject.ownapplication.responseDto.SuccessResponse;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;
import com.sakthi.ownproject.ownapplication.service.UserService;
import com.sakthi.ownproject.ownapplication.utillity.MapperUtil;

@Service
public class UserServiceImpl implements UserService {

    private MapperUtil<User, UserRequestDto> userResponMapperUtil = new MapperUtil<>();

    @Autowired
    MessageProperties messageProperties;

    @Autowired
    UserRepository userRepository;

    @SuppressWarnings({ "unchecked", "unused", "rawtypes" })
    @Override
    public BasicResponse registerForUser(User userRequestDto) {
        BasicResponse basicResponse = new BasicResponse();
        ErrorResponse error = new ErrorResponse(null, null, null);
        SuccessResponse message = new SuccessResponse(null, null);

        User userResponse = userRepository.save(userRequestDto);
        if (userResponse != null) {
            message.setMessageCode(messageProperties.getUserAddedRegistercode());
            message.setMessageDescription(messageProperties.getUserAddedRegisterSuccessDescription());
            basicResponse.setMessage(message);
            basicResponse.setData(userResponse);
        } else {
            error.setErroCode("x-->404<--x");
            error.setErrorMessage("Not Registerd");
            basicResponse.setError(error);
        }
        return basicResponse;
    }

    @SuppressWarnings({ "rawtypes", "unchecked", "unused" })
    @Override
    public BasicResponse loginForUser(UserRequestDto userRequestDto) {
        BasicResponse basicResponse = new BasicResponse();
        ErrorResponse error = new ErrorResponse(null, null, null);
        SuccessResponse message = new SuccessResponse(null, null);
        // UserResponseDto userResponseDto = new UserResponseDto();
        User result = userRepository.findByUserId(userRequestDto.getUserId());
        if (result != null && result.getUserEmail().equals(userRequestDto.getUserEmail())
                && result.getUserCredentials().equals(userRequestDto.getUserCredentials())) {
            UserResponseDto userResponseDto = userResponMapperUtil.transfer(result, UserResponseDto.class);
            if (userResponseDto != null) {
                message.setMessageCode(messageProperties.getUserVerficationCode());
                message.setMessageDescription(messageProperties.getUserVerfiactionSuccessDescription());
                basicResponse.setMessage(message);
                basicResponse.setData(userResponseDto);
            } else {
                error.setErroCode("x-->404<--x");
                error.setErrorMessage("!--Invalid User, Please Check the Username and Password--!");
                basicResponse.setError(error);
            }
        } else {
            error.setErroCode("x-->404<--x");
            error.setErrorMessage("!--Invalid User-mismatch in credentials, Please Check the Username and Password--!");
            basicResponse.setError(error);
        }
        return basicResponse;
    }

}
