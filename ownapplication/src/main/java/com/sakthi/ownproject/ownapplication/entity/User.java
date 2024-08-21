package com.sakthi.ownproject.ownapplication.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_config_detail", schema = "secured")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "user_email")
    private String userEmail;

    @Column(name = "user_credential")
    private String userCredentials;

    @Column(name = "user_address")
    private String address;

    @Column(name = "user_number")
    private String number;

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
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User(Long userId, String userEmail, String userCredentials, String address, String number) {
        this.userId = userId;
        this.userEmail = userEmail;
        this.userCredentials = userCredentials;
        this.address = address;
        this.number = number;
    }

}
