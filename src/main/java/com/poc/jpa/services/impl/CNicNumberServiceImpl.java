package com.poc.jpa.services.impl;

import com.poc.jpa.dao.CNicNumberRepository;
import com.poc.jpa.model.OneToMany.CNicNumber;
import com.poc.jpa.services.CNicNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CNicNumberServiceImpl implements CNicNumberService {

    @Autowired
    private CNicNumberRepository cNicNumberRepository;


    @Override
    public CNicNumber saveCNicNumber(CNicNumber cNicNumber) {
        return cNicNumberRepository.save(cNicNumber);
    }

    @Override
    public List<CNicNumber> getCNicNumberList() {
        return cNicNumberRepository.findAll();
    }
}
