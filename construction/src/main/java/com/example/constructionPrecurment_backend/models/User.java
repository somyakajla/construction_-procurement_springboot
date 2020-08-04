package com.example.constructionPrecurment_backend.models;


import com.example.constructionPrecurment_backend.userType.UserType;

import java.util.UUID;

public class User {
    private UserType userType;
    private final UUID id;
    private String name;
    private String email;
    private String password;
    private String city;
    private String state;
    private String phoneNumber;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(UserType userType, UUID id, String name, String email, String password, String city, String state, String phoneNumber) {
        this.userType = userType;
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
    }
}
