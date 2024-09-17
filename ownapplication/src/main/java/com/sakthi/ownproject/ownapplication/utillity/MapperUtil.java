package com.sakthi.ownproject.ownapplication.utillity;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.util.Assert;

import com.sakthi.ownproject.ownapplication.entity.User;
import com.sakthi.ownproject.ownapplication.responseDto.UserResponseDto;

public class MapperUtil<Source, Destination> {
    private final ModelMapper modelMapper;

    public MapperUtil() {
        this.modelMapper = new ModelMapper();
    }

    public UserResponseDto transfer(User ucr, Class<UserResponseDto> destination) {
        try {
            return new ModelMapper().map(ucr, destination);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
