package com.sakthi.ownproject.ownapplication.responseDto;

public class UserResponseDto {
    private Long userId;
    private String userEmail;
    private String userCredentials;
    private String Address;
    private String Number;
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserCredentials() {
        return userCredentials;
    }
    public void setUserCredentials(String userCredentials) {
        this.userCredentials = userCredentials;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getNumber() {
        return Number;
    }
    public void setNumber(String number) {
        Number = number;
    }
    public UserResponseDto(Long userId, String userEmail, String userCredentials, String address, String number) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userCredentials = userCredentials;
        Address = address;
        Number = number;
    }


}
