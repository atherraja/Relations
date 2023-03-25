package com.poc.jpa.controllers;


import com.poc.jpa.dto.UserCNicDto;
import com.poc.jpa.model.OneToOne.User;
import com.poc.jpa.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/user-Nic")
public class UserController {
    @Autowired
    UserService userService;
    @Autowired
    ModelMapper modelMapper;


    @PostMapping
    public ResponseEntity<UserCNicDto> saveUser(@RequestBody UserCNicDto userCNicDto)
    {
        //Convert DTO entity

        User userRequest = modelMapper.map(userCNicDto, User.class);

        User user = userService.saveUser(userRequest);

        // Convert entity to DTO

        UserCNicDto userResponse = modelMapper.map(user, userCNicDto.getClass());

        return new ResponseEntity<UserCNicDto>(userResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<UserCNicDto> getUserList()
    {
        return userService.getUserList().stream().map(user -> modelMapper.map(user, UserCNicDto.class))
            .collect(Collectors.toList());

    }







    }









