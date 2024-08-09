package com.sakthi.ownproject.ownapplication.entity;

import java.math.BigInteger;

public class User {

    private BigInteger userID;

    private String userEmailId;

    private String userCredentials;

    public BigInteger getUserID() {
        return userID;
    }

    public String getUserEmailId() {
        return userEmailId;
    }

    public String getUserCredentials() {
        return userCredentials;
    }

    public void setUserID(BigInteger userID) {
        this.userID = userID;
    }

    public void setUserEmailId(String userEmailId) {
        this.userEmailId = userEmailId;
    }

    public void setUserCredentials(String userCredentials) {
        this.userCredentials = userCredentials;
    }

    public User(BigInteger userID, String userEmailId, String userCredentials) {
        this.userID = userID;
        this.userEmailId = userEmailId;
        this.userCredentials = userCredentials;
    }

}
