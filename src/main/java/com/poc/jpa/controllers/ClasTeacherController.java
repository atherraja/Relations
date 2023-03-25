package com.poc.jpa.controllers;


import com.poc.jpa.dto.ClasTeacherDto;
import com.poc.jpa.dto.UserCNicDto;
import com.poc.jpa.model.ManyToMany.Clas;
import com.poc.jpa.model.OneToOne.User;
import com.poc.jpa.services.ClasService;
import com.poc.jpa.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/clas/teacher")
public class ClasTeacherController {

    @Autowired
    ClasService clasService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<ClasTeacherDto> saveClas(@RequestBody ClasTeacherDto clasTeacherDto)
    {
        //Convert DTO entity

        Clas clasRequest = modelMapper.map(clasTeacherDto, Clas.class);

        Clas clas = clasService.saveClas(clasRequest);

        // Convert entity to DTO

        ClasTeacherDto clasResponse = modelMapper.map(clas, clasTeacherDto.getClass());

        return new ResponseEntity<ClasTeacherDto>(clasResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<ClasTeacherDto> getClasList()
    {
        return clasService.getClasList().stream().map(clas -> modelMapper.map(clas, ClasTeacherDto.class))
                .collect(Collectors.toList());

    }
}
