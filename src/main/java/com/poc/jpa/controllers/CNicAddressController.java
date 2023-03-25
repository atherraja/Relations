package com.poc.jpa.controllers;

import com.poc.jpa.dto.CNicNumberAddressDto;
import com.poc.jpa.dto.UserCNicDto;
import com.poc.jpa.model.OneToMany.CNicNumber;
import com.poc.jpa.model.OneToOne.User;
import com.poc.jpa.services.CNicNumberService;
import com.poc.jpa.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cNic-address")
public class CNicAddressController {
    @Autowired
    CNicNumberService cNicNumberService;
    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<CNicNumberAddressDto> saveCNicAddress(@RequestBody CNicNumberAddressDto cNicNumberAddressDto)
    {
        //Convert DTO entity

        CNicNumber cNicNumberRequest = modelMapper.map(cNicNumberAddressDto, CNicNumber.class);

        CNicNumber cNicNumber = cNicNumberService.saveCNicNumber(cNicNumberRequest);

        // Convert entity to DTO

        CNicNumberAddressDto nicNumberAddressDtoResponse = modelMapper.map(cNicNumber, cNicNumberAddressDto.getClass());

        return new ResponseEntity<CNicNumberAddressDto>(nicNumberAddressDtoResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<CNicNumberAddressDto> getgetCNicNumberList()
    {
        return cNicNumberService.getCNicNumberList().stream().map(nicNumber -> modelMapper.map(nicNumber, CNicNumberAddressDto.class))
                .collect(Collectors.toList());

    }


}
