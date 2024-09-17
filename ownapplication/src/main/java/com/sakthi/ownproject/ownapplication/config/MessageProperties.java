package com.sakthi.ownproject.ownapplication.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:message.properties")
public class MessageProperties {

    @Value("${User.list.register.success.code}")
    String UserAddedRegistercode;

    @Value("${User.admin.register.status.success.description}")
    String UserAddedRegisterSuccessDescription;

    @Value("${User.registered.login.sucess.code}")
    String UserVerficationCode;

    @Value("${User.admin.check.login.status.cred.sucess.description}")
    String UserVerfiactionSuccessDescription;
    
    public String getUserVerficationCode() {
        return UserVerficationCode;
    }

    public void setUserVerficationCode(String userVerficationCode) {
        UserVerficationCode = userVerficationCode;
    }

    public String getUserVerfiactionSuccessDescription() {
        return UserVerfiactionSuccessDescription;
    }

    public void setUserVerfiactionSuccessDescription(String userVerfiactionSuccessDescription) {
        UserVerfiactionSuccessDescription = userVerfiactionSuccessDescription;
    }

    public String getUserAddedRegistercode() {
        return UserAddedRegistercode;
    }

    public void setUserAddedRegistercode(String userAddedRegistercode) {
        UserAddedRegistercode = userAddedRegistercode;
    }

    public String getUserAddedRegisterSuccessDescription() {
        return UserAddedRegisterSuccessDescription;
    }

    public void setUserAddedRegisterSuccessDescription(String userAddedRegisterSuccessDescription) {
        UserAddedRegisterSuccessDescription = userAddedRegisterSuccessDescription;
    }



}
