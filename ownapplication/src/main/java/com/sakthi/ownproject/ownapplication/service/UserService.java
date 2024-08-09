package com.sakthi.ownproject.ownapplication.service;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    String loginForUser(String userEmailId, String userCredentials);

}
