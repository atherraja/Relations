package com.poc.jpa.services;

import com.poc.jpa.model.OneToOne.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);


    List<User> getUserList();


}
